.class public Lcom/facebook/orca/chatheads/e;
.super Lcom/facebook/widget/d;
.source "ChatHeadButtonView.java"


# static fields
.field private static final a:Z

.field private static final b:Lcom/facebook/n/g;

.field private static final c:Lcom/facebook/n/g;


# instance fields
.field private final d:Lcom/facebook/orca/chatheads/ef;

.field private final e:Lcom/facebook/n/c;

.field private final f:Lcom/facebook/n/c;

.field private g:Lcom/google/common/d/a/ab;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/ab",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/google/common/d/a/ab;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/ab",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const-wide/high16 v2, 0x401c000000000000L    # 7.0

    .line 31
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/facebook/orca/chatheads/e;->a:Z

    .line 34
    const-wide/high16 v0, 0x4069000000000000L    # 200.0

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/n/g;->a(DD)Lcom/facebook/n/g;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/chatheads/e;->b:Lcom/facebook/n/g;

    .line 36
    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/n/g;->a(DD)Lcom/facebook/n/g;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/chatheads/e;->c:Lcom/facebook/n/g;

    return-void

    .line 31
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    .prologue
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    const/4 v5, 0x0

    const-wide v3, 0x3f747ae140000000L    # 0.004999999888241291

    .line 51
    invoke-direct {p0, p1}, Lcom/facebook/widget/d;-><init>(Landroid/content/Context;)V

    .line 53
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 54
    const-class v1, Lcom/facebook/n/j;

    const-class v2, Lcom/facebook/orca/chatheads/annotations/ForChatHeads;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/n/j;

    .line 56
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/chatheads/e;->h:Lcom/google/common/d/a/ab;

    .line 57
    iget-object v1, p0, Lcom/facebook/orca/chatheads/e;->h:Lcom/google/common/d/a/ab;

    invoke-virtual {v1, v5}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 58
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/chatheads/e;->g:Lcom/google/common/d/a/ab;

    .line 59
    iget-object v1, p0, Lcom/facebook/orca/chatheads/e;->g:Lcom/google/common/d/a/ab;

    invoke-virtual {v1, v5}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 61
    invoke-virtual {v0}, Lcom/facebook/n/j;->b()Lcom/facebook/n/c;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/chatheads/e;->b:Lcom/facebook/n/g;

    invoke-virtual {v1, v2}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Lcom/facebook/n/c;->e(D)Lcom/facebook/n/c;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Lcom/facebook/n/c;->d(D)Lcom/facebook/n/c;

    move-result-object v1

    invoke-virtual {v1, v6, v7}, Lcom/facebook/n/c;->a(D)Lcom/facebook/n/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/n/c;->i()Lcom/facebook/n/c;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/chatheads/h;

    invoke-direct {v2, p0, v5}, Lcom/facebook/orca/chatheads/h;-><init>(Lcom/facebook/orca/chatheads/e;Lcom/facebook/orca/chatheads/f;)V

    invoke-virtual {v1, v2}, Lcom/facebook/n/c;->a(Lcom/facebook/n/i;)Lcom/facebook/n/c;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/chatheads/e;->e:Lcom/facebook/n/c;

    .line 68
    invoke-virtual {v0}, Lcom/facebook/n/j;->b()Lcom/facebook/n/c;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/chatheads/e;->c:Lcom/facebook/n/g;

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/g;)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lcom/facebook/n/c;->e(D)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lcom/facebook/n/c;->d(D)Lcom/facebook/n/c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Z)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0, v6, v7}, Lcom/facebook/n/c;->a(D)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/n/c;->i()Lcom/facebook/n/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/g;

    invoke-direct {v1, p0, v5}, Lcom/facebook/orca/chatheads/g;-><init>(Lcom/facebook/orca/chatheads/e;Lcom/facebook/orca/chatheads/f;)V

    invoke-virtual {v0, v1}, Lcom/facebook/n/c;->a(Lcom/facebook/n/i;)Lcom/facebook/n/c;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/e;->f:Lcom/facebook/n/c;

    .line 77
    new-instance v0, Lcom/facebook/orca/chatheads/ef;

    new-instance v1, Lcom/facebook/orca/chatheads/ea;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/ea;-><init>(Landroid/view/View;)V

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/chatheads/ef;-><init>(Landroid/content/Context;Lcom/facebook/widget/l;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/e;->d:Lcom/facebook/orca/chatheads/ef;

    .line 78
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/e;)Lcom/google/common/d/a/ab;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->g:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method private a(D)Lcom/google/common/d/a/s;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 151
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/e;->i:Z

    if-eqz v0, :cond_0

    .line 152
    invoke-static {v2}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 168
    :goto_0
    return-object v0

    .line 155
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->f:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->d()D

    move-result-wide v0

    cmpl-double v0, v0, p1

    if-nez v0, :cond_2

    .line 156
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->h:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_1

    .line 157
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->h:Lcom/google/common/d/a/ab;

    goto :goto_0

    .line 159
    :cond_1
    invoke-static {v2}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    goto :goto_0

    .line 162
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->h:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_3

    .line 163
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->h:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->cancel(Z)Z

    .line 166
    :cond_3
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/e;->h:Lcom/google/common/d/a/ab;

    .line 167
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->f:Lcom/facebook/n/c;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 168
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->h:Lcom/google/common/d/a/ab;

    goto :goto_0
.end method

.method private a(F)Lcom/google/common/d/a/s;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 121
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/e;->i:Z

    if-eqz v0, :cond_0

    .line 122
    invoke-static {v4}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 139
    :goto_0
    return-object v0

    .line 125
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->e:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->c()D

    move-result-wide v0

    float-to-double v2, p1

    cmpl-double v0, v0, v2

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->e:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->d()D

    move-result-wide v0

    float-to-double v2, p1

    cmpl-double v0, v0, v2

    if-nez v0, :cond_2

    .line 127
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->g:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_1

    .line 128
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->g:Lcom/google/common/d/a/ab;

    goto :goto_0

    .line 130
    :cond_1
    invoke-static {v4}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    goto :goto_0

    .line 133
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->g:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_3

    .line 134
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->g:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->cancel(Z)Z

    .line 137
    :cond_3
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/e;->g:Lcom/google/common/d/a/ab;

    .line 138
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->e:Lcom/facebook/n/c;

    float-to-double v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 139
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->g:Lcom/google/common/d/a/ab;

    goto :goto_0
.end method

.method private b(D)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 180
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/e;->i:Z

    if-eqz v0, :cond_0

    .line 192
    :goto_0
    return-void

    .line 184
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->f:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->d()D

    move-result-wide v0

    cmpl-double v0, v0, p1

    if-eqz v0, :cond_1

    .line 185
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->h:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->cancel(Z)Z

    .line 186
    iput-object v2, p0, Lcom/facebook/orca/chatheads/e;->h:Lcom/google/common/d/a/ab;

    .line 191
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->f:Lcom/facebook/n/c;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/n/c;->a(D)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/n/c;->i()Lcom/facebook/n/c;

    goto :goto_0

    .line 188
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->h:Lcom/google/common/d/a/ab;

    invoke-virtual {v0, v2}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/e;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/e;->i()V

    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/chatheads/e;)Lcom/google/common/d/a/ab;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->h:Lcom/google/common/d/a/ab;

    return-object v0
.end method

.method private i()V
    .locals 1

    .prologue
    .line 210
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->f:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->e:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 211
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/e;->setViewCachingEnabled(Z)V

    .line 213
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 84
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->g:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->g:Lcom/google/common/d/a/ab;

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->cancel(Z)Z

    .line 87
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->h:Lcom/google/common/d/a/ab;

    if-eqz v0, :cond_1

    .line 88
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->h:Lcom/google/common/d/a/ab;

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->cancel(Z)Z

    .line 90
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->e:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->a()V

    .line 91
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->f:Lcom/facebook/n/c;

    invoke-virtual {v0}, Lcom/facebook/n/c;->a()V

    .line 92
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->d:Lcom/facebook/orca/chatheads/ef;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ef;->a()V

    .line 93
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/e;->i:Z

    .line 94
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 97
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/e;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 98
    if-eqz v0, :cond_0

    .line 99
    invoke-interface {v0, p0}, Landroid/view/ViewParent;->bringChildToFront(Landroid/view/View;)V

    .line 101
    :cond_0
    return-void
.end method

.method public c()Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 108
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/e;->a(F)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 112
    const v0, 0x3f68f5c3    # 0.91f

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/e;->a(F)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public e()Lcom/google/common/d/a/s;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 116
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->e:Lcom/facebook/n/c;

    const-wide v1, 0x3fd3333333333333L    # 0.3

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->a(D)Lcom/facebook/n/c;

    .line 117
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Lcom/facebook/orca/chatheads/e;->a(F)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public f()Lcom/google/common/d/a/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 143
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/chatheads/e;->a(D)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public g()Lcom/google/common/d/a/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 147
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/chatheads/e;->a(D)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public getSpringyPositioner()Lcom/facebook/orca/chatheads/ef;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/orca/chatheads/e;->d:Lcom/facebook/orca/chatheads/ef;

    return-object v0
.end method

.method public h()V
    .locals 2

    .prologue
    .line 176
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/chatheads/e;->b(D)V

    .line 177
    return-void
.end method

.method protected setViewCachingEnabled(Z)V
    .locals 2

    .prologue
    .line 199
    sget-boolean v0, Lcom/facebook/orca/chatheads/e;->a:Z

    if-eqz v0, :cond_1

    .line 200
    if-eqz p1, :cond_0

    const/4 v0, 0x2

    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/chatheads/e;->setLayerType(ILandroid/graphics/Paint;)V

    .line 204
    :goto_1
    return-void

    .line 200
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 202
    :cond_1
    invoke-virtual {p0, p1}, Lcom/facebook/orca/chatheads/e;->setDrawingCacheEnabled(Z)V

    goto :goto_1
.end method
