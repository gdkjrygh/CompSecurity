.class public Lcom/facebook/base/fragment/NavigableFragmentController;
.super Landroid/support/v4/app/Fragment;
.source "NavigableFragmentController.java"

# interfaces
.implements Lcom/facebook/base/fragment/b;


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
.field private b:Landroid/support/v4/app/Fragment;

.field private final c:Lcom/facebook/base/fragment/c;

.field private d:Lcom/facebook/base/fragment/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 55
    const-class v0, Lcom/facebook/base/fragment/NavigableFragmentController;

    sput-object v0, Lcom/facebook/base/fragment/NavigableFragmentController;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 65
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 66
    new-instance v0, Lcom/facebook/base/fragment/d;

    invoke-direct {v0, p0}, Lcom/facebook/base/fragment/d;-><init>(Lcom/facebook/base/fragment/NavigableFragmentController;)V

    iput-object v0, p0, Lcom/facebook/base/fragment/NavigableFragmentController;->c:Lcom/facebook/base/fragment/c;

    .line 72
    return-void
.end method

.method static synthetic a(Lcom/facebook/base/fragment/NavigableFragmentController;Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1, p2}, Lcom/facebook/base/fragment/NavigableFragmentController;->a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V

    return-void
.end method

.method private a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 136
    if-eqz p1, :cond_1

    .line 137
    sget-object v1, Lcom/facebook/base/fragment/NavigableFragmentController;->a:Ljava/lang/Class;

    const-string v2, "Finished fragment \'%s\' with %s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v0

    const/4 v4, 0x1

    aput-object p2, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/base/fragment/NavigableFragmentController;->q()Landroid/support/v4/app/q;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/q;->c()Z

    move-result v1

    if-nez v1, :cond_2

    .line 167
    :cond_0
    :goto_1
    return-void

    .line 139
    :cond_1
    sget-object v1, Lcom/facebook/base/fragment/NavigableFragmentController;->a:Ljava/lang/Class;

    const-string v2, "Starting Navigable Fragment Controller"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 149
    :cond_2
    const-string v1, "com.facebook.fragment.FRAGMENT_ACTION"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 150
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v2

    .line 151
    sget-object v1, Lcom/facebook/base/fragment/NavigableFragmentController;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Navigating to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 152
    if-eqz v2, :cond_0

    .line 153
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 154
    if-nez v3, :cond_3

    move v1, v0

    .line 156
    :goto_2
    if-nez v3, :cond_4

    .line 159
    :goto_3
    const-string v3, "com.facebook.fragment.PUSH_BACK_STACK"

    invoke-virtual {p2, v3}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 160
    const-string v3, "com.facebook.fragment.CLEAR_BACK_STACK"

    invoke-virtual {p2, v3}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 161
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    invoke-direct {p0, v2, v3, v1, v0}, Lcom/facebook/base/fragment/NavigableFragmentController;->a(Ljava/lang/String;Landroid/os/Bundle;ZZ)V

    goto :goto_1

    .line 154
    :cond_3
    const-string v1, "com.facebook.fragment.PUSH_BACK_STACK"

    invoke-virtual {v3, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    goto :goto_2

    .line 156
    :cond_4
    const-string v4, "com.facebook.fragment.CLEAR_BACK_STACK"

    invoke-virtual {v3, v4, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    goto :goto_3

    .line 165
    :cond_5
    iget-object v0, p0, Lcom/facebook/base/fragment/NavigableFragmentController;->d:Lcom/facebook/base/fragment/c;

    invoke-interface {v0, p0, p2}, Lcom/facebook/base/fragment/c;->a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V

    goto :goto_1
.end method

.method private a(Ljava/lang/String;Landroid/os/Bundle;ZZ)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 177
    sget-object v0, Lcom/facebook/base/fragment/NavigableFragmentController;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Starting controlled fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 178
    invoke-virtual {p0}, Lcom/facebook/base/fragment/NavigableFragmentController;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Landroid/support/v4/app/Fragment;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/fragment/NavigableFragmentController;->b:Landroid/support/v4/app/Fragment;

    .line 179
    iget-object v0, p0, Lcom/facebook/base/fragment/NavigableFragmentController;->b:Landroid/support/v4/app/Fragment;

    check-cast v0, Lcom/facebook/base/fragment/b;

    iget-object v1, p0, Lcom/facebook/base/fragment/NavigableFragmentController;->c:Lcom/facebook/base/fragment/c;

    invoke-interface {v0, v1}, Lcom/facebook/base/fragment/b;->a(Lcom/facebook/base/fragment/c;)V

    .line 181
    if-eqz p4, :cond_0

    .line 182
    invoke-virtual {p0}, Lcom/facebook/base/fragment/NavigableFragmentController;->q()Landroid/support/v4/app/q;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v3, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;I)V

    .line 185
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/base/fragment/NavigableFragmentController;->q()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    sget v1, Lcom/facebook/i;->login_fragment_controller_host:I

    iget-object v2, p0, Lcom/facebook/base/fragment/NavigableFragmentController;->b:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/ad;->a(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    move-result-object v0

    .line 188
    if-eqz p3, :cond_1

    .line 189
    invoke-virtual {v0, v3}, Landroid/support/v4/app/ad;->a(Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 192
    :cond_1
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    .line 193
    return-void
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 93
    sget v0, Lcom/facebook/k;->login_fragment_controller:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 81
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->a(Landroid/os/Bundle;)V

    .line 85
    if-eqz p1, :cond_0

    .line 86
    invoke-virtual {p0}, Lcom/facebook/base/fragment/NavigableFragmentController;->q()Landroid/support/v4/app/q;

    move-result-object v0

    sget v1, Lcom/facebook/i;->login_fragment_controller_host:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/fragment/NavigableFragmentController;->b:Landroid/support/v4/app/Fragment;

    .line 89
    :cond_0
    return-void
.end method

.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 1

    .prologue
    .line 98
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->a(Landroid/support/v4/app/Fragment;)V

    .line 103
    instance-of v0, p1, Lcom/facebook/base/fragment/b;

    if-eqz v0, :cond_0

    .line 104
    check-cast p1, Lcom/facebook/base/fragment/b;

    iget-object v0, p0, Lcom/facebook/base/fragment/NavigableFragmentController;->c:Lcom/facebook/base/fragment/c;

    invoke-interface {p1, v0}, Lcom/facebook/base/fragment/b;->a(Lcom/facebook/base/fragment/c;)V

    .line 106
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/base/fragment/c;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/facebook/base/fragment/NavigableFragmentController;->d:Lcom/facebook/base/fragment/c;

    .line 77
    return-void
.end method

.method public b(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 114
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lcom/facebook/base/fragment/NavigableFragmentController;->a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V

    .line 115
    return-void
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 122
    iget-object v0, p0, Lcom/facebook/base/fragment/NavigableFragmentController;->b:Landroid/support/v4/app/Fragment;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
