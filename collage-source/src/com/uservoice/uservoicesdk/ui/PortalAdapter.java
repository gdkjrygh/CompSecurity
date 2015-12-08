// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.UserVoice;
import com.uservoice.uservoicesdk.activity.ContactActivity;
import com.uservoice.uservoicesdk.activity.ForumActivity;
import com.uservoice.uservoicesdk.activity.SearchActivity;
import com.uservoice.uservoicesdk.flow.InitManager;
import com.uservoice.uservoicesdk.model.Article;
import com.uservoice.uservoicesdk.model.BaseModel;
import com.uservoice.uservoicesdk.model.ClientConfig;
import com.uservoice.uservoicesdk.model.Forum;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.uservoice.uservoicesdk.model.Topic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            SearchAdapter, Utils

public class PortalAdapter extends SearchAdapter
    implements android.widget.AdapterView.OnItemClickListener
{

    private static int ARTICLE = 5;
    private static int CONTACT = 4;
    private static int FORUM = 1;
    private static int KB_HEADER = 0;
    private static int LOADING = 3;
    private static int POWERED_BY = 6;
    public static int SCOPE_ALL = 0;
    public static int SCOPE_ARTICLES = 1;
    public static int SCOPE_IDEAS = 2;
    private static int TOPIC = 2;
    private List articles;
    private boolean configLoaded;
    private final FragmentActivity context;
    private LayoutInflater inflater;
    private List staticRows;

    public PortalAdapter(FragmentActivity fragmentactivity)
    {
        configLoaded = false;
        context = fragmentactivity;
        inflater = (LayoutInflater)fragmentactivity.getSystemService("layout_inflater");
        (new InitManager(fragmentactivity, new _cls1())).init();
    }

    private void computeStaticRows()
    {
        if (staticRows == null)
        {
            staticRows = new ArrayList();
            Config config = Session.getInstance().getConfig();
            if (config.shouldShowContactUs())
            {
                staticRows.add(Integer.valueOf(CONTACT));
            }
            if (config.shouldShowForum())
            {
                staticRows.add(Integer.valueOf(FORUM));
            }
            if (config.shouldShowKnowledgeBase())
            {
                staticRows.add(Integer.valueOf(KB_HEADER));
            }
        }
    }

    private List getTopics()
    {
        return Session.getInstance().getTopics();
    }

    private void loadForum()
    {
        Forum.loadForum(Session.getInstance().getConfig().getForumId(), new _cls2(context));
    }

    private void loadTopics()
    {
        _cls3 _lcls3 = new _cls3(context);
        if (Session.getInstance().getConfig().getTopicId() != -1)
        {
            Article.loadPageForTopic(Session.getInstance().getConfig().getTopicId(), 1, _lcls3);
            return;
        } else
        {
            Topic.loadTopics(new _cls4(context, _lcls3));
            return;
        }
    }

    private boolean shouldShowArticles()
    {
        return Session.getInstance().getConfig().getTopicId() != -1 || getTopics() != null && getTopics().isEmpty();
    }

    public int getCount()
    {
        int j;
        if (!configLoaded)
        {
            j = 1;
        } else
        {
            computeStaticRows();
            j = staticRows.size();
            int i;
            if (Session.getInstance().getConfig().shouldShowKnowledgeBase())
            {
                if (getTopics() == null || shouldShowArticles() && articles == null)
                {
                    i = j + 1;
                } else
                {
                    if (shouldShowArticles())
                    {
                        i = articles.size();
                    } else
                    {
                        i = getTopics().size();
                    }
                    i += j;
                }
            } else
            {
                i = j;
            }
            j = i;
            if (!Session.getInstance().getClientConfig().isWhiteLabel())
            {
                return i + 1;
            }
        }
        return j;
    }

    public Object getItem(int i)
    {
        computeStaticRows();
        if (i < staticRows.size() && ((Integer)staticRows.get(i)).intValue() == FORUM)
        {
            return Session.getInstance().getForum();
        }
        if (getTopics() != null && !shouldShowArticles() && i >= staticRows.size() && i - staticRows.size() < getTopics().size())
        {
            return getTopics().get(i - staticRows.size());
        }
        if (articles != null && shouldShowArticles() && i >= staticRows.size() && i - staticRows.size() < articles.size())
        {
            return articles.get(i - staticRows.size());
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        if (!configLoaded)
        {
            i = LOADING;
        } else
        {
            computeStaticRows();
            if (i < staticRows.size())
            {
                int j = ((Integer)staticRows.get(i)).intValue();
                i = j;
                if (j == FORUM)
                {
                    i = j;
                    if (Session.getInstance().getForum() == null)
                    {
                        return LOADING;
                    }
                }
            } else
            {
                if (Session.getInstance().getConfig().shouldShowKnowledgeBase())
                {
                    if (getTopics() == null || shouldShowArticles() && articles == null)
                    {
                        if (i - staticRows.size() == 0)
                        {
                            return LOADING;
                        }
                    } else
                    {
                        if (shouldShowArticles() && i - staticRows.size() < articles.size())
                        {
                            return ARTICLE;
                        }
                        if (!shouldShowArticles() && i - staticRows.size() < getTopics().size())
                        {
                            return TOPIC;
                        }
                    }
                }
                return POWERED_BY;
            }
        }
        return i;
    }

    public List getScopedSearchResults()
    {
        if (scope == SCOPE_ALL)
        {
            return searchResults;
        }
        if (scope == SCOPE_ARTICLES)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = searchResults.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                BaseModel basemodel = (BaseModel)iterator.next();
                if (basemodel instanceof Article)
                {
                    arraylist.add(basemodel);
                }
            } while (true);
            return arraylist;
        }
        if (scope == SCOPE_IDEAS)
        {
            ArrayList arraylist1 = new ArrayList();
            Iterator iterator1 = searchResults.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                BaseModel basemodel1 = (BaseModel)iterator1.next();
                if (basemodel1 instanceof Suggestion)
                {
                    arraylist1.add(basemodel1);
                }
            } while (true);
            return arraylist1;
        } else
        {
            return null;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int j = getItemViewType(i);
        viewgroup = view;
        if (view == null)
        {
            if (j == LOADING)
            {
                viewgroup = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_loading_item, null);
            } else
            if (j == FORUM)
            {
                viewgroup = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_text_item, null);
            } else
            if (j == KB_HEADER)
            {
                viewgroup = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_header_item_light, null);
            } else
            if (j == TOPIC)
            {
                viewgroup = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_text_item, null);
            } else
            if (j == CONTACT)
            {
                viewgroup = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_text_item, null);
            } else
            if (j == ARTICLE)
            {
                viewgroup = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_text_item, null);
            } else
            {
                viewgroup = view;
                if (j == POWERED_BY)
                {
                    viewgroup = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_powered_by_item, null);
                }
            }
        }
        if (j == FORUM)
        {
            ((TextView)viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_text)).setText(com.uservoice.uservoicesdk.R.string.uv_feedback_forum);
            view = (TextView)viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_text2);
            view.setText(Utils.getQuantityString(view, com.uservoice.uservoicesdk.R.plurals.uv_ideas, Session.getInstance().getForum().getNumberOfOpenSuggestions()));
        } else
        if (j == KB_HEADER)
        {
            ((TextView)viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text)).setText(com.uservoice.uservoicesdk.R.string.uv_knowledge_base);
        } else
        if (j == TOPIC)
        {
            view = (Topic)getItem(i);
            ((TextView)viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_text)).setText(view.getName());
            TextView textview = (TextView)viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_text2);
            if (view == Topic.ALL_ARTICLES)
            {
                textview.setVisibility(8);
            } else
            {
                textview.setVisibility(0);
                textview.setText(String.format("%d %s", new Object[] {
                    Integer.valueOf(view.getNumberOfArticles()), context.getResources().getQuantityString(com.uservoice.uservoicesdk.R.plurals.uv_articles, view.getNumberOfArticles())
                }));
            }
        } else
        if (j == CONTACT)
        {
            ((TextView)viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_text)).setText(com.uservoice.uservoicesdk.R.string.uv_contact_us);
            viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_text2).setVisibility(8);
        } else
        if (j == ARTICLE)
        {
            ((TextView)viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_text)).setText(((Article)getItem(i)).getTitle());
        } else
        if (j == POWERED_BY)
        {
            ((TextView)viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_version)).setText((new StringBuilder()).append(context.getString(com.uservoice.uservoicesdk.R.string.uv_android_sdk)).append(" v").append(UserVoice.getVersion()).toString());
        }
        view = viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_divider);
        if (view != null)
        {
            if (i == getCount() - 2 && getItemViewType(getCount() - 1) == POWERED_BY || i == getCount() - 1)
            {
                i = 8;
            } else
            {
                i = 0;
            }
            view.setVisibility(i);
        }
        if (j == FORUM)
        {
            view.setVisibility(8);
        }
        return viewgroup;
    }

    public int getViewTypeCount()
    {
        return 7;
    }

    public boolean isEnabled(int i)
    {
        if (!configLoaded)
        {
            return false;
        }
        computeStaticRows();
        if (i < staticRows.size())
        {
            i = ((Integer)staticRows.get(i)).intValue();
            if (i == KB_HEADER || i == LOADING)
            {
                return false;
            }
        }
        return true;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        int j = getItemViewType(i);
        if (j == CONTACT)
        {
            context.startActivity(new Intent(context, com/uservoice/uservoicesdk/activity/ContactActivity));
        } else
        {
            if (j == FORUM)
            {
                context.startActivity(new Intent(context, com/uservoice/uservoicesdk/activity/ForumActivity));
                return;
            }
            if (j == TOPIC || j == ARTICLE)
            {
                Utils.showModel(context, (BaseModel)getItem(i));
                return;
            }
        }
    }

    protected void searchResultsUpdated()
    {
        Iterator iterator = searchResults.iterator();
        int j = 0;
        int i = 0;
        while (iterator.hasNext()) 
        {
            int l;
            if ((BaseModel)iterator.next() instanceof Article)
            {
                int k = j;
                j = i + 1;
                i = k;
            } else
            {
                int i1 = j + 1;
                j = i;
                i = i1;
            }
            l = j;
            j = i;
            i = l;
        }
        ((SearchActivity)context).updateScopedSearch(searchResults.size(), i, j);
    }



/*
    static boolean access$002(PortalAdapter portaladapter, boolean flag)
    {
        portaladapter.configLoaded = flag;
        return flag;
    }

*/




/*
    static List access$302(PortalAdapter portaladapter, List list)
    {
        portaladapter.articles = list;
        return list;
    }

*/

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}

}
