.class public Lcom/facebook/orca/contacts/divebar/ap;
.super Ljava/lang/Object;
.source "DivebarNearbyFriendsController.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljavax/inject/a;
    .annotation runtime Lcom/facebook/orca/contacts/annotations/IsChatContextEnabled;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/backgroundlocation/status/d;

.field private final d:Lcom/facebook/orca/contacts/divebar/e;

.field private final e:Lcom/facebook/contacts/a/c;

.field private final f:Lcom/facebook/contacts/a/d;

.field private final g:Landroid/view/inputmethod/InputMethodManager;

.field private h:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

.field private i:Lcom/facebook/orca/contacts/divebar/bl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/facebook/orca/contacts/divebar/ap;

    sput-object v0, Lcom/facebook/orca/contacts/divebar/ap;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/backgroundlocation/status/d;Lcom/facebook/orca/contacts/divebar/e;Lcom/facebook/contacts/a/c;Lcom/facebook/contacts/a/d;Landroid/view/inputmethod/InputMethodManager;)V
    .locals 0
    .param p1    # Ljavax/inject/a;
        .annotation runtime Lcom/facebook/orca/contacts/annotations/IsChatContextEnabled;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/backgroundlocation/status/d;",
            "Lcom/facebook/orca/contacts/divebar/e;",
            "Lcom/facebook/contacts/a/c;",
            "Lcom/facebook/contacts/a/d;",
            "Landroid/view/inputmethod/InputMethodManager;",
            ")V"
        }
    .end annotation

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/ap;->b:Ljavax/inject/a;

    .line 56
    iput-object p2, p0, Lcom/facebook/orca/contacts/divebar/ap;->c:Lcom/facebook/backgroundlocation/status/d;

    .line 57
    iput-object p3, p0, Lcom/facebook/orca/contacts/divebar/ap;->d:Lcom/facebook/orca/contacts/divebar/e;

    .line 58
    iput-object p4, p0, Lcom/facebook/orca/contacts/divebar/ap;->e:Lcom/facebook/contacts/a/c;

    .line 59
    iput-object p5, p0, Lcom/facebook/orca/contacts/divebar/ap;->f:Lcom/facebook/contacts/a/d;

    .line 60
    iput-object p6, p0, Lcom/facebook/orca/contacts/divebar/ap;->g:Landroid/view/inputmethod/InputMethodManager;

    .line 61
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/ap;Lcom/facebook/orca/contacts/divebar/av;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/divebar/ap;->a(Lcom/facebook/orca/contacts/divebar/av;)V

    return-void
.end method

.method private a(Lcom/facebook/orca/contacts/divebar/av;)V
    .locals 2

    .prologue
    .line 132
    iget-object v0, p1, Lcom/facebook/orca/contacts/divebar/av;->a:Lcom/facebook/orca/contacts/divebar/aw;

    sget-object v1, Lcom/facebook/orca/contacts/divebar/aw;->UPSELL:Lcom/facebook/orca/contacts/divebar/aw;

    if-ne v0, v1, :cond_0

    .line 133
    sget-object v0, Lcom/facebook/orca/contacts/divebar/ap;->a:Ljava/lang/Class;

    const-string v1, "Going to background location NUX"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 139
    :goto_0
    return-void

    .line 136
    :cond_0
    sget-object v0, Lcom/facebook/orca/contacts/divebar/ap;->a:Ljava/lang/Class;

    const-string v1, "Showing list of nearby friends"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 137
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ap;->b()Z

    goto :goto_0
.end method

.method private b()Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 142
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ap;->c()Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;

    move-result-object v1

    .line 143
    if-nez v1, :cond_1

    .line 163
    :cond_0
    :goto_0
    return v0

    .line 146
    :cond_1
    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/ap;->h:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    invoke-virtual {v2}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->p()Landroid/support/v4/app/q;

    move-result-object v2

    .line 147
    invoke-virtual {v2}, Landroid/support/v4/app/q;->c()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 150
    iget-object v3, p0, Lcom/facebook/orca/contacts/divebar/ap;->i:Lcom/facebook/orca/contacts/divebar/bl;

    invoke-virtual {v1, v3}, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->a(Lcom/facebook/orca/contacts/divebar/bl;)V

    .line 151
    iget-object v3, p0, Lcom/facebook/orca/contacts/divebar/ap;->h:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    invoke-virtual {v3}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->l()Landroid/support/v4/app/i;

    move-result-object v3

    .line 152
    if-eqz v3, :cond_2

    .line 153
    iget-object v4, p0, Lcom/facebook/orca/contacts/divebar/ap;->g:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v3

    invoke-virtual {v4, v3, v0}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 156
    :cond_2
    invoke-virtual {v2}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 157
    sget v3, Lcom/facebook/b;->in_from_right:I

    sget v4, Lcom/facebook/b;->out_to_left:I

    invoke-virtual {v0, v3, v4}, Landroid/support/v4/app/ad;->a(II)Landroid/support/v4/app/ad;

    .line 158
    iget-object v3, p0, Lcom/facebook/orca/contacts/divebar/ap;->h:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    invoke-virtual {v0, v3}, Landroid/support/v4/app/ad;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 159
    invoke-virtual {v0, v1}, Landroid/support/v4/app/ad;->c(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 160
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ad;->a(Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 161
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    .line 162
    invoke-virtual {v2}, Landroid/support/v4/app/q;->b()Z

    .line 163
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private c()Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;
    .locals 5

    .prologue
    .line 167
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ap;->d()Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;

    move-result-object v0

    .line 168
    if-eqz v0, :cond_0

    .line 181
    :goto_0
    return-object v0

    .line 171
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ap;->h:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->p()Landroid/support/v4/app/q;

    move-result-object v1

    .line 172
    invoke-virtual {v1}, Landroid/support/v4/app/q;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 173
    const/4 v0, 0x0

    goto :goto_0

    .line 175
    :cond_1
    new-instance v0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;

    invoke-direct {v0}, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;-><init>()V

    .line 176
    invoke-virtual {v1}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v2

    .line 177
    sget v3, Lcom/facebook/i;->orca_diverbar_fragment_container:I

    const-string v4, "nearbyFriends"

    invoke-virtual {v2, v3, v0, v4}, Landroid/support/v4/app/ad;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 178
    invoke-virtual {v2, v0}, Landroid/support/v4/app/ad;->b(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 179
    invoke-virtual {v2}, Landroid/support/v4/app/ad;->a()I

    .line 180
    invoke-virtual {v1}, Landroid/support/v4/app/q;->b()Z

    goto :goto_0
.end method

.method private d()Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;
    .locals 2

    .prologue
    .line 185
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ap;->h:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->p()Landroid/support/v4/app/q;

    move-result-object v0

    .line 186
    const-string v1, "nearbyFriends"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/common/base/Optional;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/base/Optional",
            "<",
            "Lcom/facebook/orca/contacts/divebar/ax;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 75
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ap;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 76
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v0

    .line 113
    :goto_0
    return-object v0

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ap;->f:Lcom/facebook/contacts/a/d;

    invoke-virtual {v0}, Lcom/facebook/contacts/a/d;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 79
    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/ap;->d:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v2}, Lcom/facebook/orca/contacts/divebar/e;->b()Lcom/google/common/a/es;

    move-result-object v2

    .line 80
    iget-object v3, p0, Lcom/facebook/orca/contacts/divebar/ap;->d:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v3}, Lcom/facebook/orca/contacts/divebar/e;->e()Lcom/google/common/a/es;

    move-result-object v3

    .line 81
    iget-object v4, p0, Lcom/facebook/orca/contacts/divebar/ap;->d:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v4}, Lcom/facebook/orca/contacts/divebar/e;->f()Lcom/google/common/a/es;

    move-result-object v4

    .line 82
    iget-object v5, p0, Lcom/facebook/orca/contacts/divebar/ap;->d:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v5}, Lcom/facebook/orca/contacts/divebar/e;->c()Lcom/google/common/a/es;

    move-result-object v5

    .line 83
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v6

    .line 84
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v7

    .line 85
    const/4 v8, 0x5

    new-array v8, v8, [Ljava/util/List;

    aput-object v0, v8, v1

    const/4 v0, 0x1

    aput-object v2, v8, v0

    const/4 v0, 0x2

    aput-object v3, v8, v0

    const/4 v0, 0x3

    aput-object v4, v8, v0

    const/4 v0, 0x4

    aput-object v5, v8, v0

    array-length v2, v8

    :goto_1
    if-ge v1, v2, :cond_4

    aget-object v0, v8, v1

    .line 86
    if-nez v0, :cond_2

    .line 85
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 89
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 90
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v4

    invoke-interface {v6, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 93
    iget-object v4, p0, Lcom/facebook/orca/contacts/divebar/ap;->e:Lcom/facebook/contacts/a/c;

    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/facebook/contacts/a/c;->b(Lcom/facebook/user/UserKey;)Lcom/facebook/user/ChatContext;

    move-result-object v4

    .line 94
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/facebook/user/ChatContext;->a()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 95
    invoke-virtual {v7, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 96
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 100
    :cond_4
    invoke-virtual {v7}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 101
    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 102
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v0

    goto/16 :goto_0

    .line 104
    :cond_5
    invoke-static {v0}, Lcom/facebook/orca/contacts/divebar/av;->a(Lcom/google/common/a/es;)Lcom/facebook/orca/contacts/divebar/av;

    move-result-object v0

    .line 105
    new-instance v1, Lcom/facebook/orca/contacts/divebar/ax;

    invoke-direct {v1}, Lcom/facebook/orca/contacts/divebar/ax;-><init>()V

    invoke-virtual {v1, v0}, Lcom/facebook/orca/contacts/divebar/ax;->a(Lcom/facebook/orca/contacts/divebar/av;)Lcom/facebook/orca/contacts/divebar/ax;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/divebar/aq;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/divebar/aq;-><init>(Lcom/facebook/orca/contacts/divebar/ap;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/divebar/ax;->a(Lcom/facebook/orca/contacts/divebar/bb;)Lcom/facebook/orca/contacts/divebar/ax;

    move-result-object v0

    .line 113
    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    goto/16 :goto_0
.end method

.method public a(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/ap;->h:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    .line 68
    return-void
.end method

.method public a(Lcom/facebook/orca/contacts/divebar/bl;)V
    .locals 1

    .prologue
    .line 120
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/ap;->i:Lcom/facebook/orca/contacts/divebar/bl;

    .line 121
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/ap;->d()Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;

    move-result-object v0

    .line 122
    if-eqz v0, :cond_0

    .line 123
    invoke-virtual {v0, p1}, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->a(Lcom/facebook/orca/contacts/divebar/bl;)V

    .line 125
    :cond_0
    return-void
.end method
