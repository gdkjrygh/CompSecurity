.class public Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;
.super Lcom/facebook/base/activity/p;
.source "OrcaRootPreferenceActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# instance fields
.field private a:Lcom/facebook/widget/titlebar/a;

.field private b:Lcom/facebook/config/b/a;

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Lcom/facebook/config/a/a;

.field private j:Lcom/facebook/analytics/av;

.field private k:Lcom/facebook/c/s;

.field private l:Lcom/facebook/orca/sms/bk;

.field private m:Lcom/facebook/prefs/shared/d;

.field private n:Lcom/facebook/orca/notify/as;

.field private o:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private p:Landroid/preference/Preference;

.field private q:Landroid/preference/Preference;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Lcom/facebook/base/activity/p;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;)Lcom/facebook/c/s;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->k:Lcom/facebook/c/s;

    return-object v0
.end method

.method private a(Landroid/preference/PreferenceGroup;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 117
    new-instance v0, Landroid/preference/PreferenceCategory;

    invoke-direct {v0, p0}, Landroid/preference/PreferenceCategory;-><init>(Landroid/content/Context;)V

    .line 118
    sget v1, Lcom/facebook/o;->preference_group_title_general_settings:I

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->setTitle(I)V

    .line 119
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 121
    new-instance v1, Landroid/preference/Preference;

    invoke-direct {v1, p0}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->p:Landroid/preference/Preference;

    .line 122
    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->p:Landroid/preference/Preference;

    sget v2, Lcom/facebook/o;->preference_notifications_group_title:I

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setTitle(I)V

    .line 123
    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->p:Landroid/preference/Preference;

    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/facebook/orca/prefs/OrcaNotificationPreferenceActivity;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setIntent(Landroid/content/Intent;)V

    .line 124
    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->p:Landroid/preference/Preference;

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 126
    new-instance v1, Lcom/facebook/orca/prefs/l;

    invoke-direct {v1, p0}, Lcom/facebook/orca/prefs/l;-><init>(Landroid/content/Context;)V

    .line 127
    sget v2, Lcom/facebook/o;->preference_location_services_title:I

    invoke-virtual {v1, v2}, Lcom/facebook/orca/prefs/l;->setTitle(I)V

    .line 128
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/prefs/l;->setDefaultValue(Ljava/lang/Object;)V

    .line 129
    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 131
    iget-boolean v1, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->f:Z

    if-eqz v1, :cond_0

    .line 132
    new-instance v1, Landroid/preference/Preference;

    invoke-direct {v1, p0}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    .line 133
    sget v2, Lcom/facebook/o;->preference_contacts_title:I

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setTitle(I)V

    .line 134
    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setIntent(Landroid/content/Intent;)V

    .line 135
    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 138
    :cond_0
    iget-boolean v1, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->c:Z

    if-eqz v1, :cond_1

    .line 139
    new-instance v1, Landroid/preference/Preference;

    invoke-direct {v1, p0}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->q:Landroid/preference/Preference;

    .line 140
    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->q:Landroid/preference/Preference;

    sget v2, Lcom/facebook/o;->preference_sms_mms_group_title:I

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setTitle(I)V

    .line 141
    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->q:Landroid/preference/Preference;

    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/facebook/orca/prefs/OrcaSmsMmsPreferenceActivity;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setIntent(Landroid/content/Intent;)V

    .line 142
    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->q:Landroid/preference/Preference;

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 145
    :cond_1
    iget-boolean v1, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->g:Z

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->h:Z

    if-eqz v1, :cond_2

    .line 146
    new-instance v1, Landroid/preference/Preference;

    invoke-direct {v1, p0}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    .line 147
    sget v2, Lcom/facebook/o;->preference_partial_user_upgrade_title:I

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setTitle(I)V

    .line 148
    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setIntent(Landroid/content/Intent;)V

    .line 149
    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 152
    :cond_2
    new-instance v0, Landroid/preference/PreferenceCategory;

    invoke-direct {v0, p0}, Landroid/preference/PreferenceCategory;-><init>(Landroid/content/Context;)V

    .line 153
    sget v1, Lcom/facebook/o;->preference_group_title_info_and_account:I

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->setTitle(I)V

    .line 154
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 156
    new-instance v1, Landroid/preference/Preference;

    invoke-direct {v1, p0}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    .line 157
    sget v2, Lcom/facebook/o;->menu_about:I

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setTitle(I)V

    .line 158
    sget v2, Lcom/facebook/o;->preference_version_description:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->b:Lcom/facebook/config/b/a;

    invoke-interface {v4}, Lcom/facebook/config/b/a;->a()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v6

    iget-object v4, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->b:Lcom/facebook/config/b/a;

    invoke-interface {v4}, Lcom/facebook/config/b/a;->b()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {p0, v2, v3}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 162
    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setSummary(Ljava/lang/CharSequence;)V

    .line 163
    new-instance v2, Lcom/facebook/orca/prefs/ao;

    invoke-direct {v2, p0}, Lcom/facebook/orca/prefs/ao;-><init>(Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;)V

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 171
    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 174
    new-instance v1, Landroid/preference/Preference;

    invoke-direct {v1, p0}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    .line 175
    sget v2, Lcom/facebook/o;->preference_privacy_and_terms:I

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setTitle(I)V

    .line 176
    new-instance v2, Lcom/facebook/orca/prefs/ap;

    invoke-direct {v2, p0, p0}, Lcom/facebook/orca/prefs/ap;-><init>(Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 185
    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 188
    iget-boolean v1, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->g:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->i:Lcom/facebook/config/a/a;

    invoke-virtual {v1}, Lcom/facebook/config/a/a;->h()Lcom/facebook/config/a/b;

    move-result-object v1

    sget-object v2, Lcom/facebook/config/a/b;->PUBLIC:Lcom/facebook/config/a/b;

    if-eq v1, v2, :cond_4

    .line 189
    :cond_3
    new-instance v1, Landroid/preference/Preference;

    invoke-direct {v1, p0}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    .line 190
    sget v2, Lcom/facebook/o;->menu_switch_accounts:I

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setTitle(I)V

    .line 191
    iget-object v2, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->l:Lcom/facebook/orca/sms/bk;

    invoke-virtual {v2}, Lcom/facebook/orca/sms/bk;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v2

    .line 192
    sget v3, Lcom/facebook/o;->preference_switch_account_summary:I

    new-array v4, v5, [Ljava/lang/Object;

    aput-object v2, v4, v6

    invoke-virtual {p0, v3, v4}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setSummary(Ljava/lang/CharSequence;)V

    .line 193
    new-instance v2, Lcom/facebook/orca/prefs/aq;

    invoke-direct {v2, p0}, Lcom/facebook/orca/prefs/aq;-><init>(Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;)V

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 201
    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 205
    :cond_4
    iget-boolean v1, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->g:Z

    if-eqz v1, :cond_5

    .line 206
    new-instance v1, Landroid/preference/Preference;

    invoke-direct {v1, p0}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    .line 207
    sget v2, Lcom/facebook/o;->preference_delete_account_title:I

    invoke-virtual {p0, v2}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setTitle(Ljava/lang/CharSequence;)V

    .line 208
    new-instance v2, Lcom/facebook/orca/prefs/ar;

    invoke-direct {v2, p0}, Lcom/facebook/orca/prefs/ar;-><init>(Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;)V

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 215
    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 218
    :cond_5
    iget-boolean v1, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->d:Z

    if-eqz v1, :cond_6

    .line 219
    new-instance v1, Landroid/preference/Preference;

    invoke-direct {v1, p0}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    .line 220
    const-string v2, "Tester"

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setTitle(Ljava/lang/CharSequence;)V

    .line 221
    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/facebook/orca/prefs/OrcaTesterPreferenceActivity;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setIntent(Landroid/content/Intent;)V

    .line 222
    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 225
    :cond_6
    iget-boolean v1, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->e:Z

    if-eqz v1, :cond_7

    .line 226
    new-instance v1, Landroid/preference/Preference;

    invoke-direct {v1, p0}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    .line 227
    const-string v2, "Internal"

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setTitle(Ljava/lang/CharSequence;)V

    .line 228
    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v2}, Landroid/preference/Preference;->setIntent(Landroid/content/Intent;)V

    .line 229
    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 231
    :cond_7
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->d()V

    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;)Lcom/facebook/analytics/av;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->j:Lcom/facebook/analytics/av;

    return-object v0
.end method

.method private c()V
    .locals 8

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 245
    const/4 v3, 0x0

    .line 246
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->n:Lcom/facebook/orca/notify/as;

    invoke-virtual {v0}, Lcom/facebook/orca/notify/as;->a()Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    .line 247
    iget-object v4, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->n:Lcom/facebook/orca/notify/as;

    invoke-virtual {v4, v0}, Lcom/facebook/orca/notify/as;->b(Lcom/facebook/orca/notify/NotificationSetting;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 248
    new-instance v3, Ljava/util/Date;

    invoke-virtual {v0}, Lcom/facebook/orca/notify/NotificationSetting;->b()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 249
    invoke-static {p0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 250
    sget v3, Lcom/facebook/o;->preference_notifications_muted_until:I

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v2

    invoke-virtual {p0, v3, v1}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 302
    :goto_0
    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->p:Landroid/preference/Preference;

    invoke-virtual {v1, v0}, Landroid/preference/Preference;->setSummary(Ljava/lang/CharSequence;)V

    .line 303
    return-void

    .line 251
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/orca/notify/NotificationSetting;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 252
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->m:Lcom/facebook/prefs/shared/d;

    sget-object v4, Lcom/facebook/orca/prefs/n;->p:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v4, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v4

    .line 255
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->m:Lcom/facebook/prefs/shared/d;

    sget-object v5, Lcom/facebook/orca/prefs/n;->q:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v5, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v5

    .line 258
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->m:Lcom/facebook/prefs/shared/d;

    sget-object v6, Lcom/facebook/orca/prefs/n;->r:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v6, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v6

    .line 261
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->o:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->m:Lcom/facebook/prefs/shared/d;

    sget-object v7, Lcom/facebook/orca/prefs/n;->s:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v7, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    move v0, v1

    .line 267
    :goto_1
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 268
    if-eqz v4, :cond_1

    .line 269
    sget v2, Lcom/facebook/o;->preference_notifications_sound_enabled_title:I

    invoke-virtual {p0, v2}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 271
    :cond_1
    if-eqz v5, :cond_2

    .line 272
    sget v2, Lcom/facebook/o;->preference_notifications_vibrate_enabled_title:I

    invoke-virtual {p0, v2}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 274
    :cond_2
    if-eqz v6, :cond_3

    .line 275
    sget v2, Lcom/facebook/o;->preference_notifications_led_enabled_title:I

    invoke-virtual {p0, v2}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 277
    :cond_3
    if-eqz v0, :cond_4

    .line 278
    sget v0, Lcom/facebook/o;->preference_notifications_chat_heads_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 281
    :cond_4
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    move-object v0, v3

    goto :goto_0

    :cond_5
    move v0, v2

    .line 261
    goto :goto_1

    .line 283
    :pswitch_0
    sget v0, Lcom/facebook/o;->preference_notifications_summary_on:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 286
    :pswitch_1
    sget v0, Lcom/facebook/o;->preference_notifications_summary_one_on:I

    invoke-interface {v1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 289
    :pswitch_2
    sget v0, Lcom/facebook/o;->preference_notifications_summary_two_on:I

    invoke-interface {v1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 292
    :pswitch_3
    sget v0, Lcom/facebook/o;->preference_notifications_summary_three_on:I

    invoke-interface {v1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 295
    :pswitch_4
    sget v0, Lcom/facebook/o;->preference_notifications_summary_four_on:I

    invoke-interface {v1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 299
    :cond_6
    sget v0, Lcom/facebook/o;->preference_notifications_disabled:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private d()V
    .locals 4

    .prologue
    .line 306
    invoke-static {}, Lcom/facebook/common/h/a;->a()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    .line 308
    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->j:Lcom/facebook/analytics/av;

    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v3, "click"

    invoke-direct {v2, v3}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "button"

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "orca_preferences_delete_account_preference"

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 315
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v2, Lcom/facebook/o;->preference_delete_account_title:I

    invoke-virtual {p0, v2}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lcom/facebook/o;->preference_delete_account_dialog_message:I

    invoke-virtual {p0, v2}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lcom/facebook/o;->dialog_delete:I

    new-instance v3, Lcom/facebook/orca/prefs/at;

    invoke-direct {v3, p0, v0}, Lcom/facebook/orca/prefs/at;-><init>(Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lcom/facebook/o;->dialog_cancel:I

    new-instance v3, Lcom/facebook/orca/prefs/as;

    invoke-direct {v3, p0, v0}, Lcom/facebook/orca/prefs/as;-><init>(Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 347
    return-void
.end method


# virtual methods
.method protected b(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 85
    invoke-super {p0, p1}, Lcom/facebook/base/activity/p;->b(Landroid/os/Bundle;)V

    .line 87
    sget v0, Lcom/facebook/k;->orca_preferences:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->setContentView(I)V

    .line 89
    invoke-virtual {p0}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->b()Lcom/facebook/inject/t;

    move-result-object v1

    .line 90
    const-class v0, Lcom/facebook/config/b/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/b/a;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->b:Lcom/facebook/config/b/a;

    .line 91
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsSmsReadPermitted;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->c:Z

    .line 92
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsTesterPrefsEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->d:Z

    .line 93
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/prefs/shared/IsInternalPrefsEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->e:Z

    .line 94
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsContactsUploadPermitted;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->f:Z

    .line 96
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsPartialAccount;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->g:Z

    .line 97
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsPartialUpgradeEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->h:Z

    .line 98
    const-class v0, Lcom/facebook/config/a/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/a;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->i:Lcom/facebook/config/a/a;

    .line 99
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->j:Lcom/facebook/analytics/av;

    .line 100
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->k:Lcom/facebook/c/s;

    .line 101
    const-class v0, Lcom/facebook/orca/sms/bk;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/bk;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->l:Lcom/facebook/orca/sms/bk;

    .line 102
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->m:Lcom/facebook/prefs/shared/d;

    .line 103
    const-class v0, Lcom/facebook/orca/notify/as;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/as;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->n:Lcom/facebook/orca/notify/as;

    .line 104
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/chatheads/annotations/IsChatHeadsPermitted;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->o:Ljavax/inject/a;

    .line 107
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 108
    sget v0, Lcom/facebook/i;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/a;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->a:Lcom/facebook/widget/titlebar/a;

    .line 109
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->a:Lcom/facebook/widget/titlebar/a;

    sget v1, Lcom/facebook/o;->preference_title:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setTitle(Ljava/lang/String;)V

    .line 111
    invoke-virtual {p0}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->getPreferenceManager()Landroid/preference/PreferenceManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/preference/PreferenceManager;->createPreferenceScreen(Landroid/content/Context;)Landroid/preference/PreferenceScreen;

    move-result-object v0

    .line 112
    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->setPreferenceScreen(Landroid/preference/PreferenceScreen;)V

    .line 113
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->a(Landroid/preference/PreferenceGroup;)V

    .line 114
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 80
    sget-object v0, Lcom/facebook/analytics/f/a;->ORCA_ROOT_PREFERENCE_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method

.method public onResume()V
    .locals 0

    .prologue
    .line 235
    invoke-super {p0}, Lcom/facebook/base/activity/p;->onResume()V

    .line 241
    invoke-direct {p0}, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;->c()V

    .line 242
    return-void
.end method
