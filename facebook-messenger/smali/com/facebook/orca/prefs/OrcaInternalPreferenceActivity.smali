.class public Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;
.super Lcom/facebook/base/activity/p;
.source "OrcaInternalPreferenceActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# instance fields
.field private a:Lcom/facebook/ui/images/cache/a;

.field private b:Lcom/facebook/orca/app/dt;

.field private c:Lcom/facebook/orca/nux/h;

.field private d:Lcom/facebook/orca/chatheads/b/k;

.field private e:Lcom/facebook/contacts/upload/c;

.field private f:Lcom/facebook/common/executors/d;

.field private g:Z

.field private h:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private i:Landroid/media/AudioManager;

.field private j:Lcom/facebook/orca/fbwebrtc/ag;

.field private k:Lcom/facebook/orca/stickers/c;

.field private l:Lcom/facebook/orca/stickers/e;

.field private m:Lcom/facebook/prefs/shared/d;

.field private n:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private o:Lcom/facebook/zero/c/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0}, Lcom/facebook/base/activity/p;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)Lcom/facebook/ui/images/cache/a;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->a:Lcom/facebook/ui/images/cache/a;

    return-object v0
.end method

.method private a(Landroid/preference/PreferenceGroup;)V
    .locals 3

    .prologue
    .line 132
    invoke-direct {p0, p1}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->b(Landroid/preference/PreferenceGroup;)V

    .line 133
    invoke-direct {p0, p1}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->c(Landroid/preference/PreferenceGroup;)V

    .line 135
    new-instance v0, Landroid/preference/PreferenceCategory;

    invoke-direct {v0, p0}, Landroid/preference/PreferenceCategory;-><init>(Landroid/content/Context;)V

    .line 136
    sget v1, Lcom/facebook/o;->internal_pref_category_logging:I

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->setTitle(I)V

    .line 137
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 138
    new-instance v1, Lcom/facebook/debug/c/a;

    invoke-direct {v1, p0}, Lcom/facebook/debug/c/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 139
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->d(Landroid/preference/PreferenceGroup;)V

    .line 140
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->e(Landroid/preference/PreferenceGroup;)V

    .line 142
    new-instance v0, Landroid/preference/PreferenceCategory;

    invoke-direct {v0, p0}, Landroid/preference/PreferenceCategory;-><init>(Landroid/content/Context;)V

    .line 143
    sget v1, Lcom/facebook/o;->internal_pref_category_performance:I

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->setTitle(I)V

    .line 144
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 145
    new-instance v1, Lcom/facebook/debug/fps/h;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/debug/fps/h;-><init>(Landroid/content/Context;Z)V

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 146
    new-instance v1, Lcom/facebook/debug/f/k;

    invoke-direct {v1, p0}, Lcom/facebook/debug/f/k;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 148
    new-instance v0, Landroid/preference/PreferenceCategory;

    invoke-direct {v0, p0}, Landroid/preference/PreferenceCategory;-><init>(Landroid/content/Context;)V

    .line 149
    sget v1, Lcom/facebook/o;->internal_pref_category_profiling:I

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->setTitle(I)V

    .line 150
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 151
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->f(Landroid/preference/PreferenceGroup;)V

    .line 152
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->h(Landroid/preference/PreferenceGroup;)V

    .line 153
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->g(Landroid/preference/PreferenceGroup;)V

    .line 155
    new-instance v0, Landroid/preference/PreferenceCategory;

    invoke-direct {v0, p0}, Landroid/preference/PreferenceCategory;-><init>(Landroid/content/Context;)V

    .line 156
    sget v1, Lcom/facebook/o;->internal_pref_category_sandbox:I

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->setTitle(I)V

    .line 157
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 158
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->k(Landroid/preference/PreferenceGroup;)V

    .line 159
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->l(Landroid/preference/PreferenceGroup;)V

    .line 160
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->m(Landroid/preference/PreferenceGroup;)V

    .line 161
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->n(Landroid/preference/PreferenceGroup;)V

    .line 162
    new-instance v1, Lcom/facebook/http/f/a;

    invoke-direct {v1, p0}, Lcom/facebook/http/f/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 163
    new-instance v1, Lcom/facebook/http/f/b;

    invoke-direct {v1, p0}, Lcom/facebook/http/f/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 165
    new-instance v0, Landroid/preference/PreferenceCategory;

    invoke-direct {v0, p0}, Landroid/preference/PreferenceCategory;-><init>(Landroid/content/Context;)V

    .line 166
    sget v1, Lcom/facebook/o;->internal_pref_category_caches:I

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->setTitle(I)V

    .line 167
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 168
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->o(Landroid/preference/PreferenceGroup;)V

    .line 169
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->p(Landroid/preference/PreferenceGroup;)V

    .line 170
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->q(Landroid/preference/PreferenceGroup;)V

    .line 171
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->r(Landroid/preference/PreferenceGroup;)V

    .line 173
    new-instance v0, Landroid/preference/PreferenceCategory;

    invoke-direct {v0, p0}, Landroid/preference/PreferenceCategory;-><init>(Landroid/content/Context;)V

    .line 174
    sget v1, Lcom/facebook/o;->internal_pref_category_rolodex:I

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->setTitle(I)V

    .line 175
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 176
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->s(Landroid/preference/PreferenceGroup;)V

    .line 177
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->t(Landroid/preference/PreferenceGroup;)V

    .line 179
    new-instance v0, Landroid/preference/PreferenceCategory;

    invoke-direct {v0, p0}, Landroid/preference/PreferenceCategory;-><init>(Landroid/content/Context;)V

    .line 180
    sget v1, Lcom/facebook/o;->internal_pref_category_voip:I

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->setTitle(I)V

    .line 181
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 182
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->u(Landroid/preference/PreferenceGroup;)V

    .line 183
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->v(Landroid/preference/PreferenceGroup;)V

    .line 184
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->w(Landroid/preference/PreferenceGroup;)V

    .line 185
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->x(Landroid/preference/PreferenceGroup;)V

    .line 187
    new-instance v0, Landroid/preference/PreferenceCategory;

    invoke-direct {v0, p0}, Landroid/preference/PreferenceCategory;-><init>(Landroid/content/Context;)V

    .line 188
    sget v1, Lcom/facebook/o;->internal_pref_category_zero_rating:I

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->setTitle(I)V

    .line 189
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 190
    new-instance v1, Lcom/facebook/zero/c/e;

    invoke-direct {v1, p0}, Lcom/facebook/zero/c/e;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 191
    new-instance v1, Lcom/facebook/zero/c/c;

    invoke-direct {v1, p0}, Lcom/facebook/zero/c/c;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->o:Lcom/facebook/zero/c/c;

    .line 192
    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->o:Lcom/facebook/zero/c/c;

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 193
    new-instance v1, Lcom/facebook/zero/c/a;

    invoke-direct {v1, p0}, Lcom/facebook/zero/c/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->addPreference(Landroid/preference/Preference;)Z

    .line 195
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->h:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 196
    new-instance v0, Landroid/preference/PreferenceCategory;

    invoke-direct {v0, p0}, Landroid/preference/PreferenceCategory;-><init>(Landroid/content/Context;)V

    .line 197
    sget v1, Lcom/facebook/o;->internal_pref_category_chat_heads:I

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->setTitle(I)V

    .line 198
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 199
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->y(Landroid/preference/PreferenceGroup;)V

    .line 202
    :cond_0
    new-instance v0, Landroid/preference/PreferenceCategory;

    invoke-direct {v0, p0}, Landroid/preference/PreferenceCategory;-><init>(Landroid/content/Context;)V

    .line 203
    sget v1, Lcom/facebook/o;->internal_pref_category_wildfire:I

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->setTitle(I)V

    .line 204
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 205
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->j(Landroid/preference/PreferenceGroup;)V

    .line 207
    new-instance v0, Landroid/preference/PreferenceCategory;

    invoke-direct {v0, p0}, Landroid/preference/PreferenceCategory;-><init>(Landroid/content/Context;)V

    .line 208
    sget v1, Lcom/facebook/o;->internal_pref_category_misc:I

    invoke-virtual {v0, v1}, Landroid/preference/PreferenceCategory;->setTitle(I)V

    .line 209
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 210
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->i(Landroid/preference/PreferenceGroup;)V

    .line 211
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;Lcom/facebook/widget/c/e;Z)Z
    .locals 1

    .prologue
    .line 60
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->a(Lcom/facebook/widget/c/e;Z)Z

    move-result v0

    return v0
.end method

.method private a(Lcom/facebook/widget/c/e;Z)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 456
    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->j:Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v1}, Lcom/facebook/orca/fbwebrtc/ag;->b()I

    move-result v1

    if-nez v1, :cond_1

    .line 466
    :cond_0
    :goto_0
    return v0

    .line 459
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->i:Landroid/media/AudioManager;

    invoke-virtual {v1}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    move-result v1

    if-ne p2, v1, :cond_0

    .line 462
    invoke-virtual {p1}, Lcom/facebook/widget/c/e;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 463
    if-lez v0, :cond_2

    .line 464
    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->i:Landroid/media/AudioManager;

    invoke-virtual {v1, v0}, Landroid/media/AudioManager;->setMode(I)V

    .line 466
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)Lcom/facebook/common/executors/d;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->f:Lcom/facebook/common/executors/d;

    return-object v0
.end method

.method private b(Landroid/preference/PreferenceGroup;)V
    .locals 1

    .prologue
    .line 214
    iget-boolean v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->g:Z

    if-eqz v0, :cond_0

    .line 215
    new-instance v0, Lcom/facebook/orca/prefs/p;

    invoke-direct {v0, p0}, Lcom/facebook/orca/prefs/p;-><init>(Landroid/content/Context;)V

    .line 216
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 218
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)Lcom/facebook/orca/stickers/e;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->l:Lcom/facebook/orca/stickers/e;

    return-object v0
.end method

.method private c(Landroid/preference/PreferenceGroup;)V
    .locals 1

    .prologue
    .line 221
    new-instance v0, Lcom/facebook/orca/prefs/an;

    invoke-direct {v0, p0}, Lcom/facebook/orca/prefs/an;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 222
    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)Lcom/facebook/orca/stickers/c;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->k:Lcom/facebook/orca/stickers/c;

    return-object v0
.end method

.method private d(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 225
    new-instance v0, Landroid/preference/CheckBoxPreference;

    invoke-direct {v0, p0}, Landroid/preference/CheckBoxPreference;-><init>(Landroid/content/Context;)V

    .line 226
    sget-object v1, Lcom/facebook/prefs/shared/aj;->j:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setKey(Ljava/lang/String;)V

    .line 227
    sget v1, Lcom/facebook/o;->debug_log_enable:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setTitle(I)V

    .line 228
    sget v1, Lcom/facebook/o;->debug_log_description:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setSummary(I)V

    .line 229
    iget-object v1, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->n:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setDefaultValue(Ljava/lang/Object;)V

    .line 230
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 231
    return-void
.end method

.method static synthetic e(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)Lcom/facebook/prefs/shared/d;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->m:Lcom/facebook/prefs/shared/d;

    return-object v0
.end method

.method private e(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 234
    new-instance v0, Landroid/preference/CheckBoxPreference;

    invoke-direct {v0, p0}, Landroid/preference/CheckBoxPreference;-><init>(Landroid/content/Context;)V

    .line 235
    sget-object v1, Lcom/facebook/common/c/j;->a:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setKey(Ljava/lang/String;)V

    .line 236
    sget v1, Lcom/facebook/o;->debug_net_log_access:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setTitle(I)V

    .line 237
    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setDefaultValue(Ljava/lang/Object;)V

    .line 238
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 239
    return-void
.end method

.method static synthetic f(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)Lcom/facebook/orca/app/dt;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->b:Lcom/facebook/orca/app/dt;

    return-object v0
.end method

.method private f(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 242
    new-instance v0, Landroid/preference/CheckBoxPreference;

    invoke-direct {v0, p0}, Landroid/preference/CheckBoxPreference;-><init>(Landroid/content/Context;)V

    .line 243
    sget-object v1, Lcom/facebook/http/f/c;->b:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setKey(Ljava/lang/String;)V

    .line 244
    sget v1, Lcom/facebook/o;->debug_php_profiling:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setTitle(I)V

    .line 245
    sget v1, Lcom/facebook/o;->debug_php_profiling_description:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setSummary(I)V

    .line 246
    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setDefaultValue(Ljava/lang/Object;)V

    .line 247
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 248
    return-void
.end method

.method static synthetic g(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)Lcom/facebook/orca/nux/h;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->c:Lcom/facebook/orca/nux/h;

    return-object v0
.end method

.method private g(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 251
    new-instance v0, Landroid/preference/CheckBoxPreference;

    invoke-direct {v0, p0}, Landroid/preference/CheckBoxPreference;-><init>(Landroid/content/Context;)V

    .line 252
    sget-object v1, Lcom/facebook/http/f/c;->c:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setKey(Ljava/lang/String;)V

    .line 253
    sget v1, Lcom/facebook/o;->debug_wirehog_profiling:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setTitle(I)V

    .line 254
    sget v1, Lcom/facebook/o;->debug_wirehog_profiling_description:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setSummary(I)V

    .line 255
    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setDefaultValue(Ljava/lang/Object;)V

    .line 256
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 257
    return-void
.end method

.method static synthetic h(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)Lcom/facebook/orca/chatheads/b/k;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->d:Lcom/facebook/orca/chatheads/b/k;

    return-object v0
.end method

.method private h(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 260
    new-instance v0, Landroid/preference/CheckBoxPreference;

    invoke-direct {v0, p0}, Landroid/preference/CheckBoxPreference;-><init>(Landroid/content/Context;)V

    .line 261
    sget-object v1, Lcom/facebook/http/f/c;->d:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setKey(Ljava/lang/String;)V

    .line 262
    sget v1, Lcom/facebook/o;->debug_teak_profiling:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setTitle(I)V

    .line 263
    sget v1, Lcom/facebook/o;->debug_teak_profiling_description:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setSummary(I)V

    .line 264
    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setDefaultValue(Ljava/lang/Object;)V

    .line 265
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 266
    return-void
.end method

.method static synthetic i(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)Lcom/facebook/contacts/upload/c;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->e:Lcom/facebook/contacts/upload/c;

    return-object v0
.end method

.method private i(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 269
    new-instance v0, Landroid/preference/CheckBoxPreference;

    invoke-direct {v0, p0}, Landroid/preference/CheckBoxPreference;-><init>(Landroid/content/Context;)V

    .line 270
    sget-object v1, Lcom/facebook/orca/prefs/o;->x:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setKey(Ljava/lang/String;)V

    .line 271
    sget v1, Lcom/facebook/o;->debug_force_fb4a_look_and_feel:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setTitle(I)V

    .line 272
    sget v1, Lcom/facebook/o;->debug_force_fb4a_look_and_feel_description:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setSummary(I)V

    .line 273
    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setDefaultValue(Ljava/lang/Object;)V

    .line 274
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 275
    return-void
.end method

.method private j(Landroid/preference/PreferenceGroup;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 280
    new-instance v0, Landroid/preference/CheckBoxPreference;

    invoke-direct {v0, p0}, Landroid/preference/CheckBoxPreference;-><init>(Landroid/content/Context;)V

    .line 281
    sget-object v1, Lcom/facebook/orca/prefs/o;->y:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setKey(Ljava/lang/String;)V

    .line 282
    sget v1, Lcom/facebook/o;->debug_force_wildfire_alternative_start:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setTitle(I)V

    .line 283
    sget v1, Lcom/facebook/o;->debug_force_wildfire_alternative_start_description:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setSummary(I)V

    .line 284
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setDefaultValue(Ljava/lang/Object;)V

    .line 285
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 287
    new-instance v0, Landroid/preference/CheckBoxPreference;

    invoke-direct {v0, p0}, Landroid/preference/CheckBoxPreference;-><init>(Landroid/content/Context;)V

    .line 288
    sget-object v1, Lcom/facebook/orca/prefs/o;->z:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setKey(Ljava/lang/String;)V

    .line 289
    sget v1, Lcom/facebook/o;->debug_force_wildfire_skip_start:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setTitle(I)V

    .line 290
    sget v1, Lcom/facebook/o;->debug_force_wildfire_skip_start_description:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setSummary(I)V

    .line 291
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setDefaultValue(Ljava/lang/Object;)V

    .line 292
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 293
    return-void
.end method

.method private k(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 296
    new-instance v0, Lcom/facebook/widget/c/e;

    invoke-direct {v0, p0}, Lcom/facebook/widget/c/e;-><init>(Landroid/content/Context;)V

    .line 297
    sget-object v1, Lcom/facebook/http/f/c;->j:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setKey(Ljava/lang/String;)V

    .line 298
    sget v1, Lcom/facebook/o;->debug_web_server_tier_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setTitle(I)V

    .line 299
    sget v1, Lcom/facebook/o;->debug_web_server_tier_description:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setSummary(I)V

    .line 300
    const-string v1, "default"

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setDefaultValue(Ljava/lang/Object;)V

    .line 301
    sget v1, Lcom/facebook/c;->web_server_tiers:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setEntries(I)V

    .line 302
    sget v1, Lcom/facebook/c;->web_server_tiers_values:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setEntryValues(I)V

    .line 303
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 304
    return-void
.end method

.method private l(Landroid/preference/PreferenceGroup;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 307
    new-instance v0, Lcom/facebook/widget/c/a;

    invoke-direct {v0, p0}, Lcom/facebook/widget/c/a;-><init>(Landroid/content/Context;)V

    .line 308
    sget-object v1, Lcom/facebook/http/f/c;->k:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/a;->setKey(Ljava/lang/String;)V

    .line 309
    sget v1, Lcom/facebook/o;->debug_web_sandbox_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/a;->setTitle(I)V

    .line 310
    sget v1, Lcom/facebook/o;->debug_web_sandbox_description:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/a;->a(Ljava/lang/CharSequence;)V

    .line 311
    sget v1, Lcom/facebook/o;->debug_web_sandbox_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/a;->setDialogTitle(I)V

    .line 312
    invoke-virtual {v0}, Lcom/facebook/widget/c/a;->getEditText()Landroid/widget/EditText;

    move-result-object v1

    sget v2, Lcom/facebook/o;->debug_web_sandbox_hint:I

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setHint(I)V

    .line 313
    invoke-virtual {v0}, Lcom/facebook/widget/c/a;->getEditText()Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/widget/EditText;->setSingleLine(Z)V

    .line 314
    invoke-virtual {v0}, Lcom/facebook/widget/c/a;->getEditText()Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/widget/EditText;->setInputType(I)V

    .line 315
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 316
    return-void
.end method

.method private m(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 319
    new-instance v0, Lcom/facebook/widget/c/e;

    invoke-direct {v0, p0}, Lcom/facebook/widget/c/e;-><init>(Landroid/content/Context;)V

    .line 320
    sget-object v1, Lcom/facebook/http/f/c;->m:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setKey(Ljava/lang/String;)V

    .line 321
    sget v1, Lcom/facebook/o;->debug_mqtt_server_tier_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setTitle(I)V

    .line 322
    sget v1, Lcom/facebook/o;->debug_mqtt_server_tier_description:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setSummary(I)V

    .line 323
    const-string v1, "default"

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setDefaultValue(Ljava/lang/Object;)V

    .line 324
    sget v1, Lcom/facebook/c;->mqtt_server_tiers:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setEntries(I)V

    .line 325
    sget v1, Lcom/facebook/c;->mqtt_server_tiers_values:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setEntryValues(I)V

    .line 326
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 327
    return-void
.end method

.method private n(Landroid/preference/PreferenceGroup;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 330
    new-instance v0, Lcom/facebook/widget/c/a;

    invoke-direct {v0, p0}, Lcom/facebook/widget/c/a;-><init>(Landroid/content/Context;)V

    .line 331
    sget-object v1, Lcom/facebook/http/f/c;->n:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/a;->setKey(Ljava/lang/String;)V

    .line 332
    sget v1, Lcom/facebook/o;->debug_mqtt_sandbox_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/a;->setTitle(I)V

    .line 333
    sget v1, Lcom/facebook/o;->debug_mqtt_sandbox_description:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/a;->a(Ljava/lang/CharSequence;)V

    .line 334
    sget v1, Lcom/facebook/o;->debug_mqtt_sandbox_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/a;->setDialogTitle(I)V

    .line 335
    invoke-virtual {v0}, Lcom/facebook/widget/c/a;->getEditText()Landroid/widget/EditText;

    move-result-object v1

    sget v2, Lcom/facebook/o;->debug_mqtt_sandbox_hint:I

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setHint(I)V

    .line 336
    invoke-virtual {v0}, Lcom/facebook/widget/c/a;->getEditText()Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/widget/EditText;->setSingleLine(Z)V

    .line 337
    invoke-virtual {v0}, Lcom/facebook/widget/c/a;->getEditText()Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/widget/EditText;->setInputType(I)V

    .line 338
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 339
    return-void
.end method

.method private o(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 342
    new-instance v0, Landroid/preference/Preference;

    invoke-direct {v0, p0}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    .line 343
    sget v1, Lcom/facebook/o;->preference_clear_image_cache_title:I

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setTitle(I)V

    .line 344
    sget v1, Lcom/facebook/o;->preference_clear_image_cache_description:I

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setSummary(I)V

    .line 345
    new-instance v1, Lcom/facebook/orca/prefs/z;

    invoke-direct {v1, p0}, Lcom/facebook/orca/prefs/z;-><init>(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 361
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 362
    return-void
.end method

.method private p(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 365
    new-instance v0, Landroid/preference/Preference;

    invoke-direct {v0, p0}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    .line 366
    sget v1, Lcom/facebook/o;->preference_clear_stickers_cache_title:I

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setTitle(I)V

    .line 367
    sget v1, Lcom/facebook/o;->preference_clear_stickers_cache_description:I

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setSummary(I)V

    .line 368
    new-instance v1, Lcom/facebook/orca/prefs/ab;

    invoke-direct {v1, p0}, Lcom/facebook/orca/prefs/ab;-><init>(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 388
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 389
    return-void
.end method

.method private q(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 392
    new-instance v0, Landroid/preference/Preference;

    invoke-direct {v0, p0}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    .line 393
    sget v1, Lcom/facebook/o;->preference_clear_thread_cache_title:I

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setTitle(I)V

    .line 394
    sget v1, Lcom/facebook/o;->preference_clear_thread_cache_description:I

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setSummary(I)V

    .line 395
    new-instance v1, Lcom/facebook/orca/prefs/ad;

    invoke-direct {v1, p0}, Lcom/facebook/orca/prefs/ad;-><init>(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 411
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 412
    return-void
.end method

.method private r(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 415
    new-instance v0, Landroid/preference/Preference;

    invoke-direct {v0, p0}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    .line 416
    sget v1, Lcom/facebook/o;->preference_reset_nux_title:I

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setTitle(I)V

    .line 417
    new-instance v1, Lcom/facebook/orca/prefs/af;

    invoke-direct {v1, p0}, Lcom/facebook/orca/prefs/af;-><init>(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 425
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 426
    return-void
.end method

.method private s(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 429
    new-instance v0, Lcom/facebook/widget/c/e;

    invoke-direct {v0, p0}, Lcom/facebook/widget/c/e;-><init>(Landroid/content/Context;)V

    .line 430
    sget-object v1, Lcom/facebook/contacts/upload/a;->g:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setKey(Ljava/lang/String;)V

    .line 431
    sget v1, Lcom/facebook/o;->debug_upload_contacts_batch_size_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setTitle(I)V

    .line 432
    sget v1, Lcom/facebook/o;->debug_upload_contacts_batch_size_description:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setSummary(I)V

    .line 433
    const-string v1, "-1"

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setDefaultValue(Ljava/lang/Object;)V

    .line 434
    sget v1, Lcom/facebook/c;->upload_contacts_batch_sizes:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setEntries(I)V

    .line 435
    sget v1, Lcom/facebook/c;->upload_contacts_batch_size_values:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setEntryValues(I)V

    .line 436
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 437
    return-void
.end method

.method private t(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 440
    new-instance v0, Landroid/preference/Preference;

    invoke-direct {v0, p0}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    .line 441
    sget v1, Lcom/facebook/o;->debug_upload_contacts_title:I

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setTitle(I)V

    .line 442
    sget v1, Lcom/facebook/o;->debug_upload_contacts_description:I

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setSummary(I)V

    .line 443
    new-instance v1, Lcom/facebook/orca/prefs/ag;

    invoke-direct {v1, p0}, Lcom/facebook/orca/prefs/ag;-><init>(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)V

    invoke-virtual {v0, v1}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 451
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 452
    return-void
.end method

.method private u(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 470
    new-instance v0, Lcom/facebook/widget/c/e;

    invoke-direct {v0, p0}, Lcom/facebook/widget/c/e;-><init>(Landroid/content/Context;)V

    .line 471
    sget-object v1, Lcom/facebook/orca/prefs/f;->b:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setKey(Ljava/lang/String;)V

    .line 472
    sget v1, Lcom/facebook/o;->debug_voip_audio_mode_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setTitle(I)V

    .line 473
    sget v1, Lcom/facebook/o;->debug_voip_audio_mode_description:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setSummary(I)V

    .line 474
    const-string v1, "-1"

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setDefaultValue(Ljava/lang/Object;)V

    .line 475
    sget v1, Lcom/facebook/c;->voip_audio_modes:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setEntries(I)V

    .line 476
    sget v1, Lcom/facebook/c;->voip_audio_modes_values:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setEntryValues(I)V

    .line 477
    new-instance v1, Lcom/facebook/orca/prefs/ah;

    invoke-direct {v1, p0}, Lcom/facebook/orca/prefs/ah;-><init>(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 483
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 484
    return-void
.end method

.method private v(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 487
    new-instance v0, Lcom/facebook/widget/c/e;

    invoke-direct {v0, p0}, Lcom/facebook/widget/c/e;-><init>(Landroid/content/Context;)V

    .line 488
    sget-object v1, Lcom/facebook/orca/prefs/f;->c:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setKey(Ljava/lang/String;)V

    .line 489
    sget v1, Lcom/facebook/o;->debug_voip_speaker_audio_mode_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setTitle(I)V

    .line 490
    sget v1, Lcom/facebook/o;->debug_voip_speaker_audio_mode_description:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setSummary(I)V

    .line 491
    const-string v1, "-1"

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setDefaultValue(Ljava/lang/Object;)V

    .line 492
    sget v1, Lcom/facebook/c;->voip_audio_modes:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setEntries(I)V

    .line 493
    sget v1, Lcom/facebook/c;->voip_audio_modes_values:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setEntryValues(I)V

    .line 494
    new-instance v1, Lcom/facebook/orca/prefs/ai;

    invoke-direct {v1, p0}, Lcom/facebook/orca/prefs/ai;-><init>(Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 501
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 502
    return-void
.end method

.method private w(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 505
    new-instance v0, Lcom/facebook/widget/c/e;

    invoke-direct {v0, p0}, Lcom/facebook/widget/c/e;-><init>(Landroid/content/Context;)V

    .line 506
    sget-object v1, Lcom/facebook/orca/prefs/f;->d:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setKey(Ljava/lang/String;)V

    .line 507
    sget v1, Lcom/facebook/o;->debug_voip_volume_stream_type_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setTitle(I)V

    .line 508
    sget v1, Lcom/facebook/o;->debug_voip_volume_stream_type_description:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setSummary(I)V

    .line 509
    const-string v1, "-1"

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setDefaultValue(Ljava/lang/Object;)V

    .line 510
    sget v1, Lcom/facebook/c;->voip_stream_types:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setEntries(I)V

    .line 511
    sget v1, Lcom/facebook/c;->voip_stream_types_values:I

    invoke-virtual {v0, v1}, Lcom/facebook/widget/c/e;->setEntryValues(I)V

    .line 512
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 513
    return-void
.end method

.method private x(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 516
    new-instance v0, Landroid/preference/CheckBoxPreference;

    invoke-direct {v0, p0}, Landroid/preference/CheckBoxPreference;-><init>(Landroid/content/Context;)V

    .line 517
    sget-object v1, Lcom/facebook/orca/fbwebrtc/ay;->c:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setKey(Ljava/lang/String;)V

    .line 518
    sget v1, Lcom/facebook/o;->debug_voip_user_acceptance_title:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setTitle(I)V

    .line 519
    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setDefaultValue(Ljava/lang/Object;)V

    .line 520
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 521
    return-void
.end method

.method private y(Landroid/preference/PreferenceGroup;)V
    .locals 2

    .prologue
    .line 524
    new-instance v0, Landroid/preference/CheckBoxPreference;

    invoke-direct {v0, p0}, Landroid/preference/CheckBoxPreference;-><init>(Landroid/content/Context;)V

    .line 525
    sget-object v1, Lcom/facebook/orca/prefs/n;->F:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setKey(Ljava/lang/String;)V

    .line 526
    sget v1, Lcom/facebook/o;->chat_heads_translucent_when_inactive:I

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setTitle(I)V

    .line 527
    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/preference/CheckBoxPreference;->setDefaultValue(Ljava/lang/Object;)V

    .line 528
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceGroup;->addPreference(Landroid/preference/Preference;)Z

    .line 529
    return-void
.end method


# virtual methods
.method protected b(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 87
    invoke-super {p0, p1}, Lcom/facebook/base/activity/p;->b(Landroid/os/Bundle;)V

    .line 89
    sget v0, Lcom/facebook/k;->orca_preferences:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->setContentView(I)V

    .line 91
    invoke-virtual {p0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->b()Lcom/facebook/inject/t;

    move-result-object v1

    .line 92
    const-class v0, Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/cache/a;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->a:Lcom/facebook/ui/images/cache/a;

    .line 93
    const-class v0, Lcom/facebook/orca/app/dt;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/app/dt;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->b:Lcom/facebook/orca/app/dt;

    .line 94
    const-class v0, Lcom/facebook/orca/nux/h;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/nux/h;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->c:Lcom/facebook/orca/nux/h;

    .line 95
    const-class v0, Lcom/facebook/contacts/upload/c;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/upload/c;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->e:Lcom/facebook/contacts/upload/c;

    .line 96
    const-class v0, Lcom/facebook/common/executors/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/d;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->f:Lcom/facebook/common/executors/d;

    .line 97
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsMobileOnlineAvailabilityPermitted;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->g:Z

    .line 99
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/chatheads/annotations/IsChatHeadsPermitted;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->h:Ljavax/inject/a;

    .line 100
    const-class v0, Landroid/media/AudioManager;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->i:Landroid/media/AudioManager;

    .line 101
    const-class v0, Lcom/facebook/orca/fbwebrtc/ag;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/fbwebrtc/ag;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->j:Lcom/facebook/orca/fbwebrtc/ag;

    .line 102
    const-class v0, Lcom/facebook/orca/chatheads/b/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/b/k;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->d:Lcom/facebook/orca/chatheads/b/k;

    .line 103
    const-class v0, Lcom/facebook/orca/stickers/c;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/c;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->k:Lcom/facebook/orca/stickers/c;

    .line 104
    const-class v0, Lcom/facebook/orca/stickers/e;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/e;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->l:Lcom/facebook/orca/stickers/e;

    .line 105
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->m:Lcom/facebook/prefs/shared/d;

    .line 106
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/common/annotations/IsDebugLogsEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->n:Ljavax/inject/a;

    .line 108
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 109
    sget v0, Lcom/facebook/i;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/a;

    .line 110
    sget v1, Lcom/facebook/o;->internal_pref_category_title:I

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setTitle(I)V

    .line 112
    invoke-virtual {p0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->getPreferenceManager()Landroid/preference/PreferenceManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/preference/PreferenceManager;->createPreferenceScreen(Landroid/content/Context;)Landroid/preference/PreferenceScreen;

    move-result-object v0

    .line 113
    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->setPreferenceScreen(Landroid/preference/PreferenceScreen;)V

    .line 114
    invoke-direct {p0, v0}, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->a(Landroid/preference/PreferenceGroup;)V

    .line 115
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 82
    sget-object v0, Lcom/facebook/analytics/f/a;->ORCA_INTERNAL_PREFERENCE_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 1

    .prologue
    .line 119
    invoke-super {p0}, Lcom/facebook/base/activity/p;->onAttachedToWindow()V

    .line 121
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->o:Lcom/facebook/zero/c/c;

    invoke-virtual {v0}, Lcom/facebook/zero/c/c;->a()V

    .line 122
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 126
    invoke-super {p0}, Lcom/facebook/base/activity/p;->onDetachedFromWindow()V

    .line 128
    iget-object v0, p0, Lcom/facebook/orca/prefs/OrcaInternalPreferenceActivity;->o:Lcom/facebook/zero/c/c;

    invoke-virtual {v0}, Lcom/facebook/zero/c/c;->b()V

    .line 129
    return-void
.end method
