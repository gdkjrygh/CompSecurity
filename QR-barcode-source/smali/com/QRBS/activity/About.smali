.class public Lcom/QRBS/activity/About;
.super Lcom/actionbarsherlock/app/SherlockPreferenceActivity;
.source "About.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public createPreferences(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)Landroid/preference/Preference;
    .locals 5
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "s"    # Ljava/lang/String;
    .param p3, "s1"    # Ljava/lang/String;
    .param p4, "intent"    # Landroid/content/Intent;

    .prologue
    const/4 v4, 0x0

    .line 30
    new-instance v0, Landroid/preference/Preference;

    invoke-direct {v0, p1}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    .line 31
    .local v0, "preference":Landroid/preference/Preference;
    invoke-virtual {v0, p2}, Landroid/preference/Preference;->setTitle(Ljava/lang/CharSequence;)V

    .line 32
    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, p3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 33
    .local v1, "spannablestring":Landroid/text/SpannableString;
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    const-string v3, "#094291"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-direct {v2, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v1}, Landroid/text/SpannableString;->length()I

    move-result v3

    invoke-virtual {v1, v2, v4, v3, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 34
    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setSummary(Ljava/lang/CharSequence;)V

    .line 35
    if-eqz p4, :cond_0

    .line 37
    invoke-virtual {v0, p4}, Landroid/preference/Preference;->setIntent(Landroid/content/Intent;)V

    .line 39
    :cond_0
    return-object v0
.end method

.method public fillPreferences(Landroid/content/Context;Landroid/preference/PreferenceScreen;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "preferencescreen"    # Landroid/preference/PreferenceScreen;
    .param p3, "s"    # Ljava/lang/String;
    .param p4, "arraylist"    # Ljava/util/ArrayList;

    .prologue
    .line 44
    new-instance v1, Landroid/preference/PreferenceCategory;

    invoke-direct {v1, p1}, Landroid/preference/PreferenceCategory;-><init>(Landroid/content/Context;)V

    .line 45
    .local v1, "preferencecategory":Landroid/preference/PreferenceCategory;
    invoke-virtual {v1, p3}, Landroid/preference/PreferenceCategory;->setTitle(Ljava/lang/CharSequence;)V

    .line 46
    invoke-virtual {p2, v1}, Landroid/preference/PreferenceScreen;->addPreference(Landroid/preference/Preference;)Z

    .line 48
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lt v0, v2, :cond_0

    .line 50
    return-void

    .line 49
    :cond_0
    invoke-virtual {p4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/preference/Preference;

    invoke-virtual {v1, v2}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 48
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 14
    .param p1, "bundle"    # Landroid/os/Bundle;

    .prologue
    .line 54
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockPreferenceActivity;->onCreate(Landroid/os/Bundle;)V

    .line 56
    const-string v10, ""

    const-string v11, "On create About"

    invoke-static {v10, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    invoke-virtual {p0}, Lcom/QRBS/activity/About;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    .line 58
    .local v0, "ab":Lcom/actionbarsherlock/app/ActionBar;
    const v10, 0x7f0200d4

    invoke-virtual {v0, v10}, Lcom/actionbarsherlock/app/ActionBar;->setIcon(I)V

    .line 59
    const v10, 0x7f0800b1

    invoke-virtual {v0, v10}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 60
    const v10, 0x7f0800c6

    invoke-virtual {v0, v10}, Lcom/actionbarsherlock/app/ActionBar;->setSubtitle(I)V

    .line 61
    const/4 v10, 0x1

    invoke-virtual {v0, v10}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 62
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 63
    .local v3, "linearlayout":Landroid/widget/LinearLayout;
    const/4 v10, 0x1

    invoke-virtual {v3, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 64
    new-instance v4, Landroid/widget/ListView;

    invoke-direct {v4, p0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 65
    .local v4, "listview":Landroid/widget/ListView;
    const v10, 0x102000a

    invoke-virtual {v4, v10}, Landroid/widget/ListView;->setId(I)V

    .line 66
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v11, -0x1

    const/4 v12, -0x2

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-direct {v10, v11, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v4, v10}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 67
    const-string v10, "#00000000"

    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v4, v10}, Landroid/widget/ListView;->setCacheColorHint(I)V

    .line 68
    const v10, 0x7f0200e7

    invoke-virtual {v4, v10}, Landroid/widget/ListView;->setSelector(I)V

    .line 70
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 71
    invoke-virtual {p0, v3}, Lcom/QRBS/activity/About;->setContentView(Landroid/view/View;)V

    .line 72
    const v10, 0x7f070077

    invoke-virtual {p0, v10}, Lcom/QRBS/activity/About;->setTheme(I)V

    .line 73
    invoke-virtual {p0}, Lcom/QRBS/activity/About;->getPreferenceManager()Landroid/preference/PreferenceManager;

    move-result-object v10

    invoke-virtual {v10, p0}, Landroid/preference/PreferenceManager;->createPreferenceScreen(Landroid/content/Context;)Landroid/preference/PreferenceScreen;

    move-result-object v9

    .line 74
    .local v9, "preferencescreen":Landroid/preference/PreferenceScreen;
    const v10, 0x7f0800f1

    invoke-virtual {p0, v10}, Lcom/QRBS/activity/About;->getString(I)Ljava/lang/String;

    move-result-object v10

    const-string v11, "WB Development Team"

    const/4 v12, 0x0

    invoke-virtual {p0, p0, v10, v11, v12}, Lcom/QRBS/activity/About;->createPreferences(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)Landroid/preference/Preference;

    move-result-object v5

    .line 75
    .local v5, "preference":Landroid/preference/Preference;
    const v10, 0x7f0800f2

    invoke-virtual {p0, v10}, Lcom/QRBS/activity/About;->getString(I)Ljava/lang/String;

    move-result-object v10

    const-string v11, "2.5.7"

    const/4 v12, 0x0

    invoke-virtual {p0, p0, v10, v11, v12}, Lcom/QRBS/activity/About;->createPreferences(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)Landroid/preference/Preference;

    move-result-object v6

    .line 76
    .local v6, "preference1":Landroid/preference/Preference;
    const v10, 0x7f0800f3

    invoke-virtual {p0, v10}, Lcom/QRBS/activity/About;->getString(I)Ljava/lang/String;

    move-result-object v10

    const-string v11, "02/04/2015"

    const/4 v12, 0x0

    invoke-virtual {p0, p0, v10, v11, v12}, Lcom/QRBS/activity/About;->createPreferences(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)Landroid/preference/Preference;

    move-result-object v7

    .line 77
    .local v7, "preference2":Landroid/preference/Preference;
    new-instance v2, Landroid/content/Intent;

    const-class v10, Lcom/QRBS/activity/Licenza;

    invoke-direct {v2, p0, v10}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 78
    .local v2, "intent1":Landroid/content/Intent;
    const v10, 0x7f0800f4

    invoke-virtual {p0, v10}, Lcom/QRBS/activity/About;->getString(I)Ljava/lang/String;

    move-result-object v10

    const-string v11, ""

    invoke-virtual {p0, p0, v10, v11, v2}, Lcom/QRBS/activity/About;->createPreferences(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)Landroid/preference/Preference;

    move-result-object v8

    .line 80
    .local v8, "preference4":Landroid/preference/Preference;
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .local v1, "arraylist":Ljava/util/ArrayList;
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    const v10, 0x7f080145

    invoke-virtual {p0, v10}, Lcom/QRBS/activity/About;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p0, p0, v9, v10, v1}, Lcom/QRBS/activity/About;->fillPreferences(Landroid/content/Context;Landroid/preference/PreferenceScreen;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 88
    invoke-virtual {p0, v9}, Lcom/QRBS/activity/About;->setPreferenceScreen(Landroid/preference/PreferenceScreen;)V

    .line 90
    return-void
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 1
    .param p1, "menuitem"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 95
    invoke-virtual {p0}, Lcom/QRBS/activity/About;->finish()V

    .line 96
    const/4 v0, 0x1

    return v0
.end method
