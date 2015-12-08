// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import org.chromium.base.ThreadUtils;

// Referenced classes of package org.chromium.content.browser:
//            BindingManagerImpl, ChildProcessConnection

private class mConnection
{

    static final boolean $assertionsDisabled;
    private boolean mBoundForBackgroundPeriod;
    private ChildProcessConnection mConnection;
    private boolean mInForeground;
    private boolean mWasOomProtected;
    final BindingManagerImpl this$0;

    private void addStrongBinding()
    {
        ChildProcessConnection childprocessconnection = mConnection;
        if (childprocessconnection == null)
        {
            return;
        } else
        {
            childprocessconnection.addStrongBinding();
            return;
        }
    }

    private void dropBindings()
    {
        if (!$assertionsDisabled && !BindingManagerImpl.access$100(BindingManagerImpl.this))
        {
            throw new AssertionError();
        }
        ChildProcessConnection childprocessconnection = mConnection;
        if (childprocessconnection == null)
        {
            return;
        } else
        {
            childprocessconnection.dropOomBindings();
            return;
        }
    }

    private void removeInitialBinding()
    {
        final ChildProcessConnection connection = mConnection;
        if (connection == null || !connection.isInitialBindingBound())
        {
            return;
        } else
        {
            ThreadUtils.postOnUiThreadDelayed(new Runnable() {

                final BindingManagerImpl.ManagedConnection this$1;
                final ChildProcessConnection val$connection;

                public void run()
                {
                    if (connection.isInitialBindingBound())
                    {
                        connection.removeInitialBinding();
                    }
                }

            
            {
                this$1 = BindingManagerImpl.ManagedConnection.this;
                connection = childprocessconnection;
                super();
            }
            }, BindingManagerImpl.access$000(BindingManagerImpl.this));
            return;
        }
    }

    private void removeStrongBinding()
    {
        final ChildProcessConnection connection = mConnection;
        if (connection == null || !connection.isStrongBindingBound())
        {
            return;
        }
        connection = new Runnable() {

            final BindingManagerImpl.ManagedConnection this$1;
            final ChildProcessConnection val$connection;

            public void run()
            {
                if (connection.isStrongBindingBound())
                {
                    connection.removeStrongBinding();
                }
            }

            
            {
                this$1 = BindingManagerImpl.ManagedConnection.this;
                connection = childprocessconnection;
                super();
            }
        };
        if (BindingManagerImpl.access$100(BindingManagerImpl.this))
        {
            connection.run();
            return;
        } else
        {
            ThreadUtils.postOnUiThreadDelayed(connection, BindingManagerImpl.access$200(BindingManagerImpl.this));
            return;
        }
    }

    void clearConnection()
    {
        mWasOomProtected = mConnection.isOomProtectedOrWasWhenDied();
        mConnection = null;
    }

    boolean isConnectionCleared()
    {
        return mConnection == null;
    }

    boolean isOomProtected()
    {
        if (mConnection != null)
        {
            return mConnection.isOomProtectedOrWasWhenDied();
        } else
        {
            return mWasOomProtected;
        }
    }

    void setBoundForBackgroundPeriod(boolean flag)
    {
        if (mBoundForBackgroundPeriod || !flag) goto _L2; else goto _L1
_L1:
        addStrongBinding();
_L4:
        mBoundForBackgroundPeriod = flag;
        return;
_L2:
        if (mBoundForBackgroundPeriod && !flag)
        {
            removeStrongBinding();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void setInForeground(boolean flag)
    {
        if (mInForeground || !flag) goto _L2; else goto _L1
_L1:
        addStrongBinding();
_L4:
        removeInitialBinding();
        mInForeground = flag;
        return;
_L2:
        if (mInForeground && !flag)
        {
            removeStrongBinding();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/BindingManagerImpl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }


    _cls2.val.connection(ChildProcessConnection childprocessconnection)
    {
        this$0 = BindingManagerImpl.this;
        super();
        mConnection = childprocessconnection;
    }
}
