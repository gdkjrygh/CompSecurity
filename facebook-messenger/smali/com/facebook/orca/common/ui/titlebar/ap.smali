.class public Lcom/facebook/orca/common/ui/titlebar/ap;
.super Ljava/lang/Object;
.source "TitleBarDivebarButtonOverlayController.java"


# static fields
.field private static final a:Lcom/facebook/prefs/shared/ae;

.field private static b:Z


# instance fields
.field private final c:Lcom/facebook/orca/contacts/divebar/a;

.field private final d:Lcom/facebook/orca/contacts/divebar/e;

.field private final e:Lcom/facebook/orca/f/k;

.field private final f:Lcom/facebook/l/k;

.field private final g:Lcom/facebook/c/s;

.field private final h:Lcom/facebook/common/time/a;

.field private final i:Lcom/facebook/prefs/shared/d;

.field private final j:Lcom/facebook/l/v;

.field private k:Lcom/facebook/orca/common/ui/titlebar/ac;

.field private l:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;"
        }
    .end annotation
.end field

.field private m:Lcom/facebook/user/User;

.field private n:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 44
    sget-object v0, Lcom/facebook/orca/prefs/n;->a:Lcom/facebook/prefs/shared/ae;

    const-string v1, "last_badge_time"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/common/ui/titlebar/ap;->a:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/contacts/divebar/a;Lcom/facebook/orca/contacts/divebar/e;Lcom/facebook/orca/f/k;Lcom/facebook/l/k;Lcom/facebook/c/s;Lcom/facebook/common/time/a;Lcom/facebook/prefs/shared/d;)V
    .locals 1

    .prologue
    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->c:Lcom/facebook/orca/contacts/divebar/a;

    .line 74
    iput-object p2, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->d:Lcom/facebook/orca/contacts/divebar/e;

    .line 75
    iput-object p3, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->e:Lcom/facebook/orca/f/k;

    .line 76
    iput-object p4, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->f:Lcom/facebook/l/k;

    .line 77
    iput-object p5, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->g:Lcom/facebook/c/s;

    .line 78
    iput-object p6, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->h:Lcom/facebook/common/time/a;

    .line 79
    iput-object p7, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->i:Lcom/facebook/prefs/shared/d;

    .line 80
    new-instance v0, Lcom/facebook/orca/common/ui/titlebar/aq;

    invoke-direct {v0, p0}, Lcom/facebook/orca/common/ui/titlebar/aq;-><init>(Lcom/facebook/orca/common/ui/titlebar/ap;)V

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->j:Lcom/facebook/l/v;

    .line 86
    return-void
.end method

.method public static a()V
    .locals 1

    .prologue
    .line 93
    const/4 v0, 0x1

    sput-boolean v0, Lcom/facebook/orca/common/ui/titlebar/ap;->b:Z

    .line 94
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/titlebar/ap;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/ap;->d()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/common/ui/titlebar/ap;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/ap;->c()V

    return-void
.end method

.method private c()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 137
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->m:Lcom/facebook/user/User;

    if-eqz v0, :cond_0

    .line 138
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->k:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 139
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->m:Lcom/facebook/user/User;

    invoke-virtual {v1}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v1

    .line 140
    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->e:Lcom/facebook/orca/f/k;

    invoke-virtual {v2, v1}, Lcom/facebook/orca/f/k;->c(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    .line 141
    if-eqz v1, :cond_1

    .line 142
    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    .line 143
    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/facebook/orca/threadview/ThreadViewActivity;

    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 144
    const-string v3, "thread_id"

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 145
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->g:Lcom/facebook/c/s;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 156
    :cond_0
    :goto_0
    return-void

    .line 147
    :cond_1
    new-instance v1, Lcom/facebook/user/UserWithIdentifier;

    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->m:Lcom/facebook/user/User;

    iget-object v3, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->m:Lcom/facebook/user/User;

    invoke-virtual {v3}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/facebook/user/UserWithIdentifier;-><init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V

    .line 149
    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 150
    const-string v3, "to"

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 151
    const-string v1, "show_composer"

    invoke-virtual {v2, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 152
    const-string v1, "disable_redirect_to_thread_view"

    invoke-virtual {v2, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 153
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->g:Lcom/facebook/c/s;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    goto :goto_0
.end method

.method private d()V
    .locals 8

    .prologue
    .line 159
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->f:Lcom/facebook/l/k;

    invoke-virtual {v0}, Lcom/facebook/l/k;->c()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    .line 160
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->c:Lcom/facebook/orca/contacts/divebar/a;

    invoke-virtual {v1}, Lcom/facebook/orca/contacts/divebar/a;->a()Lcom/facebook/orca/contacts/divebar/d;

    move-result-object v1

    iget-object v1, v1, Lcom/facebook/orca/contacts/divebar/d;->a:Ljava/util/Set;

    .line 162
    sget-object v2, Lcom/facebook/orca/contacts/divebar/c;->STEADY_STATE_COUNT:Lcom/facebook/orca/contacts/divebar/c;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 163
    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->k:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->a(I)V

    .line 166
    :cond_0
    sget-object v2, Lcom/facebook/orca/contacts/divebar/c;->STEADY_STATE_GREEN_DOT:Lcom/facebook/orca/contacts/divebar/c;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 167
    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->k:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-virtual {v2}, Lcom/facebook/orca/common/ui/titlebar/ac;->a()V

    .line 172
    :cond_1
    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->c:Lcom/facebook/orca/contacts/divebar/a;

    invoke-virtual {v2}, Lcom/facebook/orca/contacts/divebar/a;->a()Lcom/facebook/orca/contacts/divebar/d;

    move-result-object v2

    iget-wide v2, v2, Lcom/facebook/orca/contacts/divebar/d;->b:J

    .line 173
    sget-boolean v4, Lcom/facebook/orca/common/ui/titlebar/ap;->b:Z

    if-nez v4, :cond_2

    iget-object v4, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->i:Lcom/facebook/prefs/shared/d;

    sget-object v5, Lcom/facebook/orca/common/ui/titlebar/ap;->a:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v6, 0x0

    invoke-interface {v4, v5, v6, v7}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v4

    add-long/2addr v2, v4

    iget-object v4, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->h:Lcom/facebook/common/time/a;

    invoke-interface {v4}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-lez v2, :cond_2

    .line 200
    :goto_0
    return-void

    .line 182
    :cond_2
    sget-boolean v2, Lcom/facebook/orca/common/ui/titlebar/ap;->b:Z

    if-eqz v2, :cond_5

    sget-object v2, Lcom/facebook/orca/contacts/divebar/c;->ON_OPEN_COUNT:Lcom/facebook/orca/contacts/divebar/c;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 183
    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->k:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->b(I)V

    .line 193
    :cond_3
    :goto_1
    sget-boolean v2, Lcom/facebook/orca/common/ui/titlebar/ap;->b:Z

    if-nez v2, :cond_4

    sget-object v2, Lcom/facebook/orca/contacts/divebar/c;->CHAT_HEAD_ROLL:Lcom/facebook/orca/contacts/divebar/c;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 194
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/ap;->e()V

    .line 197
    :cond_4
    const/4 v1, 0x0

    sput-boolean v1, Lcom/facebook/orca/common/ui/titlebar/ap;->b:Z

    .line 198
    iput v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->n:I

    .line 199
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->i:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/common/ui/titlebar/ap;->a:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->h:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    goto :goto_0

    .line 184
    :cond_5
    sget-boolean v2, Lcom/facebook/orca/common/ui/titlebar/ap;->b:Z

    if-nez v2, :cond_3

    iget v2, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->n:I

    if-eq v2, v0, :cond_3

    sget-object v2, Lcom/facebook/orca/contacts/divebar/c;->ON_TRANSITION_COUNT:Lcom/facebook/orca/contacts/divebar/c;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 187
    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->k:Lcom/facebook/orca/common/ui/titlebar/ac;

    iget v3, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->n:I

    invoke-virtual {v2, v3, v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->a(II)V

    goto :goto_1
.end method

.method private e()V
    .locals 6

    .prologue
    .line 203
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->f:Lcom/facebook/l/k;

    invoke-virtual {v0}, Lcom/facebook/l/k;->c()Ljava/util/Collection;

    move-result-object v0

    .line 204
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->d:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v1}, Lcom/facebook/orca/contacts/divebar/e;->b()Lcom/google/common/a/es;

    move-result-object v2

    .line 205
    const/4 v1, 0x0

    .line 206
    if-eqz v2, :cond_1

    .line 207
    invoke-static {v0}, Lcom/google/common/a/kl;->a(Ljava/lang/Iterable;)Ljava/util/HashSet;

    move-result-object v3

    .line 208
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v4

    .line 210
    invoke-virtual {v2}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 211
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    .line 212
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 213
    invoke-interface {v4, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 214
    if-nez v1, :cond_3

    iget-object v5, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->l:Ljava/util/Set;

    if-eqz v5, :cond_3

    iget-object v5, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->l:Ljava/util/Set;

    invoke-interface {v5, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :goto_1
    move-object v1, v0

    .line 220
    goto :goto_0

    .line 222
    :cond_0
    iput-object v4, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->l:Ljava/util/Set;

    .line 225
    :cond_1
    if-eqz v1, :cond_2

    .line 226
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->e:Lcom/facebook/orca/f/k;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/User;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->m:Lcom/facebook/user/User;

    .line 227
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->m:Lcom/facebook/user/User;

    if-eqz v0, :cond_2

    .line 228
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->k:Lcom/facebook/orca/common/ui/titlebar/ac;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->m:Lcom/facebook/user/User;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/ac;->a(Lcom/facebook/user/User;)V

    .line 231
    :cond_2
    return-void

    :cond_3
    move-object v0, v1

    goto :goto_1
.end method


# virtual methods
.method public a(Lcom/facebook/widget/titlebar/a;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 101
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->c:Lcom/facebook/orca/contacts/divebar/a;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/a;->a()Lcom/facebook/orca/contacts/divebar/d;

    move-result-object v0

    .line 102
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->c:Lcom/facebook/orca/contacts/divebar/a;

    invoke-virtual {v1}, Lcom/facebook/orca/contacts/divebar/a;->b()V

    .line 104
    iget-object v0, v0, Lcom/facebook/orca/contacts/divebar/d;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    invoke-interface {p1}, Lcom/facebook/widget/titlebar/a;->b()V

    .line 123
    :goto_0
    return-void

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->f:Lcom/facebook/l/k;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->j:Lcom/facebook/l/v;

    invoke-virtual {v0, v1}, Lcom/facebook/l/k;->a(Lcom/facebook/l/v;)V

    .line 110
    invoke-interface {p1}, Lcom/facebook/widget/titlebar/a;->getTitleBarDivebarButtonOverlay()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/titlebar/ac;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->k:Lcom/facebook/orca/common/ui/titlebar/ac;

    .line 112
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->k:Lcom/facebook/orca/common/ui/titlebar/ac;

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/ar;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/ar;-><init>(Lcom/facebook/orca/common/ui/titlebar/ap;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/ac;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 120
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->k:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/common/ui/titlebar/ac;->setClickable(Z)V

    .line 121
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->k:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/common/ui/titlebar/ac;->setVisibility(I)V

    .line 122
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/ap;->d()V

    goto :goto_0
.end method

.method public b()V
    .locals 2

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->k:Lcom/facebook/orca/common/ui/titlebar/ac;

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->k:Lcom/facebook/orca/common/ui/titlebar/ac;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/ac;->setVisibility(I)V

    .line 133
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->f:Lcom/facebook/l/k;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ap;->j:Lcom/facebook/l/v;

    invoke-virtual {v0, v1}, Lcom/facebook/l/k;->b(Lcom/facebook/l/v;)V

    .line 134
    return-void
.end method
