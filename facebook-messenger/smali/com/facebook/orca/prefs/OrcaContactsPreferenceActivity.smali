.class public Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;
.super Lcom/facebook/base/activity/p;
.source "OrcaContactsPreferenceActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# instance fields
.field private a:Lcom/facebook/orca/prefs/y;

.field private b:Lcom/facebook/widget/titlebar/a;

.field private c:Landroid/support/v4/a/e;

.field private d:Landroid/preference/Preference;

.field private e:Landroid/preference/Preference;

.field private f:Lcom/facebook/contacts/upload/c;

.field private g:Lcom/facebook/fbservice/ops/c;

.field private h:Lcom/facebook/analytics/av;

.field private i:Lcom/facebook/prefs/shared/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/facebook/base/activity/p;-><init>()V

    .line 57
    sget-object v0, Lcom/facebook/orca/prefs/y;->NOT_STARTED:Lcom/facebook/orca/prefs/y;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a:Lcom/facebook/orca/prefs/y;

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)Lcom/facebook/fbservice/ops/c;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->g:Lcom/facebook/fbservice/ops/c;

    return-object v0
.end method

.method private a(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 169
    new-instance v0, Landroid/preference/Preference;

    invoke-direct {v0, p0}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->d:Landroid/preference/Preference;

    .line 170
    sget-object v0, Lcom/facebook/orca/prefs/y;->NOT_STARTED:Lcom/facebook/orca/prefs/y;

    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a(Lcom/facebook/orca/prefs/y;)V

    .line 172
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->d:Landroid/preference/Preference;

    new-instance v1, Lcom/facebook/orca/prefs/s;

    invoke-direct {v1, p0}, Lcom/facebook/orca/prefs/s;-><init>(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 180
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->d:Landroid/preference/Preference;

    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 181
    return-void
.end method

.method private a(Lcom/facebook/contacts/upload/ContactsUploadState;)V
    .locals 8

    .prologue
    const/4 v4, 0x1

    const/4 v7, 0x0

    .line 232
    invoke-static {}, Ljava/text/NumberFormat;->getPercentInstance()Ljava/text/NumberFormat;

    move-result-object v1

    .line 233
    invoke-virtual {v1, v7}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 235
    sget-object v0, Lcom/facebook/orca/prefs/x;->b:[I

    invoke-virtual {p1}, Lcom/facebook/contacts/upload/ContactsUploadState;->a()Lcom/facebook/contacts/upload/k;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/contacts/upload/k;->ordinal()I

    move-result v2

    aget v0, v0, v2

    packed-switch v0, :pswitch_data_0

    .line 268
    :goto_0
    return-void

    .line 237
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->e:Landroid/preference/Preference;

    sget v1, Lcom/facebook/o;->preference_contacts_sync_contacts_title:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setTitle(Ljava/lang/CharSequence;)V

    .line 239
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->e:Landroid/preference/Preference;

    invoke-virtual {v0, v4}, Landroid/preference/Preference;->setEnabled(Z)V

    goto :goto_0

    .line 242
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->e:Landroid/preference/Preference;

    sget v2, Lcom/facebook/o;->preference_contacts_sync_contacts_syncing:I

    new-array v3, v4, [Ljava/lang/Object;

    const-wide/16 v4, 0x0

    invoke-virtual {v1, v4, v5}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v7

    invoke-virtual {p0, v2, v3}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setTitle(Ljava/lang/CharSequence;)V

    .line 244
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->e:Landroid/preference/Preference;

    invoke-virtual {v0, v7}, Landroid/preference/Preference;->setEnabled(Z)V

    goto :goto_0

    .line 247
    :pswitch_2
    const/4 v0, 0x0

    .line 248
    invoke-virtual {p1}, Lcom/facebook/contacts/upload/ContactsUploadState;->d()I

    move-result v2

    if-lez v2, :cond_0

    .line 249
    invoke-virtual {p1}, Lcom/facebook/contacts/upload/ContactsUploadState;->c()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Lcom/facebook/contacts/upload/ContactsUploadState;->d()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v0, v2

    .line 252
    :cond_0
    iget-object v2, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->e:Landroid/preference/Preference;

    sget v3, Lcom/facebook/o;->preference_contacts_sync_contacts_syncing:I

    new-array v4, v4, [Ljava/lang/Object;

    float-to-double v5, v0

    invoke-virtual {v1, v5, v6}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v7

    invoke-virtual {p0, v3, v4}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/preference/Preference;->setTitle(Ljava/lang/CharSequence;)V

    .line 255
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->e:Landroid/preference/Preference;

    invoke-virtual {v0, v7}, Landroid/preference/Preference;->setEnabled(Z)V

    goto :goto_0

    .line 258
    :pswitch_3
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->e:Landroid/preference/Preference;

    sget v1, Lcom/facebook/o;->preference_contacts_sync_contacts_synced:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setTitle(Ljava/lang/CharSequence;)V

    .line 260
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->e:Landroid/preference/Preference;

    invoke-virtual {v0, v4}, Landroid/preference/Preference;->setEnabled(Z)V

    goto :goto_0

    .line 263
    :pswitch_4
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->e:Landroid/preference/Preference;

    sget v1, Lcom/facebook/o;->preference_contacts_sync_contacts_error:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setTitle(Ljava/lang/CharSequence;)V

    .line 265
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->e:Landroid/preference/Preference;

    invoke-virtual {v0, v7}, Landroid/preference/Preference;->setEnabled(Z)V

    goto :goto_0

    .line 235
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method static synthetic a(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;Lcom/facebook/contacts/upload/ContactsUploadState;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0, p1}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a(Lcom/facebook/contacts/upload/ContactsUploadState;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;Lcom/facebook/orca/prefs/y;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0, p1}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a(Lcom/facebook/orca/prefs/y;)V

    return-void
.end method

.method private a(Lcom/facebook/orca/prefs/y;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 143
    iput-object p1, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a:Lcom/facebook/orca/prefs/y;

    .line 144
    sget-object v0, Lcom/facebook/orca/prefs/x;->a:[I

    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a:Lcom/facebook/orca/prefs/y;

    invoke-virtual {v1}, Lcom/facebook/orca/prefs/y;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 166
    :goto_0
    return-void

    .line 146
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->d:Landroid/preference/Preference;

    sget v1, Lcom/facebook/o;->preference_contacts_delete_contacts_title:I

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setTitle(I)V

    .line 148
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->d:Landroid/preference/Preference;

    invoke-virtual {v0, v3}, Landroid/preference/Preference;->setEnabled(Z)V

    goto :goto_0

    .line 151
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->d:Landroid/preference/Preference;

    sget v1, Lcom/facebook/o;->preference_contacts_delete_contacts_deleting:I

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setTitle(I)V

    .line 153
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->d:Landroid/preference/Preference;

    invoke-virtual {v0, v2}, Landroid/preference/Preference;->setEnabled(Z)V

    goto :goto_0

    .line 156
    :pswitch_2
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->d:Landroid/preference/Preference;

    sget v1, Lcom/facebook/o;->preference_contacts_delete_contacts_deleted:I

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setTitle(I)V

    .line 158
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->d:Landroid/preference/Preference;

    invoke-virtual {v0, v3}, Landroid/preference/Preference;->setEnabled(Z)V

    goto :goto_0

    .line 161
    :pswitch_3
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->d:Landroid/preference/Preference;

    sget v1, Lcom/facebook/o;->preference_contacts_delete_contacts_error:I

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setTitle(I)V

    .line 163
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->d:Landroid/preference/Preference;

    invoke-virtual {v0, v2}, Landroid/preference/Preference;->setEnabled(Z)V

    goto :goto_0

    .line 144
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private b(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 271
    new-instance v0, Landroid/preference/Preference;

    invoke-direct {v0, p0}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->e:Landroid/preference/Preference;

    .line 272
    invoke-static {}, Lcom/facebook/contacts/upload/ContactsUploadState;->e()Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a(Lcom/facebook/contacts/upload/ContactsUploadState;)V

    .line 274
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->e:Landroid/preference/Preference;

    new-instance v1, Lcom/facebook/orca/prefs/v;

    invoke-direct {v1, p0}, Lcom/facebook/orca/prefs/v;-><init>(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 292
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->e:Landroid/preference/Preference;

    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 293
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->c()V

    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)Lcom/facebook/analytics/av;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->h:Lcom/facebook/analytics/av;

    return-object v0
.end method

.method private c()V
    .locals 4

    .prologue
    .line 184
    invoke-static {}, Lcom/facebook/common/h/a;->a()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    .line 186
    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->h:Lcom/facebook/analytics/av;

    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v3, "click"

    invoke-direct {v2, v3}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "button"

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "orca_preferences_delete_synced_contacts_preference"

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 193
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v2, Lcom/facebook/o;->preference_contacts_delete_contacts_title:I

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lcom/facebook/o;->preference_contacts_delete_contacts_dialog_message:I

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lcom/facebook/o;->dialog_delete:I

    new-instance v3, Lcom/facebook/orca/prefs/u;

    invoke-direct {v3, p0, v0}, Lcom/facebook/orca/prefs/u;-><init>(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lcom/facebook/o;->dialog_cancel:I

    new-instance v3, Lcom/facebook/orca/prefs/t;

    invoke-direct {v3, p0, v0}, Lcom/facebook/orca/prefs/t;-><init>(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 229
    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)Lcom/facebook/orca/prefs/y;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a:Lcom/facebook/orca/prefs/y;

    return-object v0
.end method

.method private d()V
    .locals 3

    .prologue
    .line 296
    new-instance v0, Lcom/facebook/orca/prefs/w;

    invoke-direct {v0, p0}, Lcom/facebook/orca/prefs/w;-><init>(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)V

    .line 305
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 306
    const-string v2, "com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 307
    iget-object v2, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->c:Landroid/support/v4/a/e;

    invoke-virtual {v2, v0, v1}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 308
    return-void
.end method

.method static synthetic e(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->d()V

    return-void
.end method

.method static synthetic f(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)Lcom/facebook/contacts/upload/c;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->f:Lcom/facebook/contacts/upload/c;

    return-object v0
.end method


# virtual methods
.method protected b(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 78
    invoke-super {p0, p1}, Lcom/facebook/base/activity/p;->b(Landroid/os/Bundle;)V

    .line 80
    invoke-static {p0}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 81
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 83
    const-class v0, Landroid/support/v4/a/e;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/e;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->c:Landroid/support/v4/a/e;

    .line 84
    const-class v0, Lcom/facebook/contacts/upload/c;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/upload/c;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->f:Lcom/facebook/contacts/upload/c;

    .line 85
    const-class v0, Lcom/facebook/fbservice/ops/c;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/c;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->g:Lcom/facebook/fbservice/ops/c;

    .line 86
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->h:Lcom/facebook/analytics/av;

    .line 87
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->i:Lcom/facebook/prefs/shared/d;

    .line 89
    sget v0, Lcom/facebook/k;->orca_preferences:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->setContentView(I)V

    .line 91
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 92
    sget v0, Lcom/facebook/i;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/a;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->b:Lcom/facebook/widget/titlebar/a;

    .line 93
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->b:Lcom/facebook/widget/titlebar/a;

    sget v1, Lcom/facebook/o;->preference_contacts_title:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setTitle(Ljava/lang/String;)V

    .line 95
    invoke-virtual {p0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->getPreferenceManager()Landroid/preference/PreferenceManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/preference/PreferenceManager;->createPreferenceScreen(Landroid/content/Context;)Landroid/preference/PreferenceScreen;

    move-result-object v0

    .line 96
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a(Landroid/preference/PreferenceGroup;)V

    .line 97
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->b(Landroid/preference/PreferenceGroup;)V

    .line 98
    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->setPreferenceScreen(Landroid/preference/PreferenceScreen;)V

    .line 100
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->g:Lcom/facebook/fbservice/ops/c;

    new-instance v1, Lcom/facebook/orca/prefs/r;

    invoke-direct {v1, p0}, Lcom/facebook/orca/prefs/r;-><init>(Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/c;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 113
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 73
    sget-object v0, Lcom/facebook/analytics/f/a;->ORCA_CONTACTS_PREFERENCE_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 138
    invoke-super {p0, p1}, Lcom/facebook/base/activity/p;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 139
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->g:Lcom/facebook/fbservice/ops/c;

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/ops/c;->b(Landroid/os/Bundle;)V

    .line 140
    return-void
.end method

.method protected onResume()V
    .locals 3

    .prologue
    .line 117
    invoke-super {p0}, Lcom/facebook/base/activity/p;->onResume()V

    .line 119
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->i:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/contacts/upload/a;->b:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->f:Lcom/facebook/contacts/upload/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/upload/c;->b()Lcom/facebook/contacts/upload/ContactsUploadState;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a(Lcom/facebook/contacts/upload/ContactsUploadState;)V

    .line 122
    invoke-direct {p0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->d()V

    .line 125
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->g:Lcom/facebook/fbservice/ops/c;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/c;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 126
    sget-object v0, Lcom/facebook/orca/prefs/y;->IN_PROGRESS:Lcom/facebook/orca/prefs/y;

    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->a(Lcom/facebook/orca/prefs/y;)V

    .line 128
    :cond_1
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 132
    invoke-super {p0, p1}, Lcom/facebook/base/activity/p;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 133
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaContactsPreferenceActivity;->g:Lcom/facebook/fbservice/ops/c;

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/ops/c;->a(Landroid/os/Bundle;)V

    .line 134
    return-void
.end method
