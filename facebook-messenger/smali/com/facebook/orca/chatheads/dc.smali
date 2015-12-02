.class public Lcom/facebook/orca/chatheads/dc;
.super Ljava/lang/Object;
.source "ChatThreadController.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/view/WindowManager;

.field private c:Landroid/view/ViewGroup;

.field private d:Lcom/facebook/orca/chatheads/dh;

.field private e:Lcom/facebook/orca/chatheads/dg;

.field private f:Lcom/facebook/orca/emoji/ai;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/WindowManager;Landroid/view/ViewGroup;)V
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dc;->a:Landroid/content/Context;

    .line 121
    iput-object p2, p0, Lcom/facebook/orca/chatheads/dc;->b:Landroid/view/WindowManager;

    .line 122
    iput-object p3, p0, Lcom/facebook/orca/chatheads/dc;->c:Landroid/view/ViewGroup;

    .line 124
    new-instance v0, Lcom/facebook/orca/chatheads/dh;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dc;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/facebook/orca/chatheads/dh;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    .line 125
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    new-instance v1, Lcom/facebook/orca/chatheads/de;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/chatheads/de;-><init>(Lcom/facebook/orca/chatheads/dc;Lcom/facebook/orca/chatheads/dd;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/dh;->setEmojiKeyboardWindowControl(Lcom/facebook/orca/emoji/ah;)V

    .line 126
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v1, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/dh;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 130
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {p3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 131
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/dc;)Lcom/facebook/orca/chatheads/dg;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->e:Lcom/facebook/orca/chatheads/dg;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/dc;Lcom/facebook/orca/chatheads/dg;)Lcom/facebook/orca/chatheads/dg;
    .locals 0

    .prologue
    .line 19
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dc;->e:Lcom/facebook/orca/chatheads/dg;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/dc;Lcom/facebook/orca/emoji/ai;)Lcom/facebook/orca/emoji/ai;
    .locals 0

    .prologue
    .line 19
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dc;->f:Lcom/facebook/orca/emoji/ai;

    return-object p1
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/dc;)Landroid/view/WindowManager;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->b:Landroid/view/WindowManager;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/chatheads/dc;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/orca/chatheads/dc;)Lcom/facebook/orca/emoji/ai;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->f:Lcom/facebook/orca/emoji/ai;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/orca/chatheads/dc;)Lcom/facebook/orca/chatheads/dh;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/messages/threads/model/ThreadViewSpec;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dh;->getThread()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/graphics/PointF;)V
    .locals 1

    .prologue
    .line 208
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/dh;->setNubTarget(Landroid/graphics/PointF;)V

    .line 209
    return-void
.end method

.method public a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/dh;->setThread(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 161
    return-void
.end method

.method public a(Lcom/facebook/orca/chatheads/dt;)V
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/dh;->setListener(Lcom/facebook/orca/chatheads/dt;)V

    .line 153
    return-void
.end method

.method public b()Lcom/facebook/orca/chatheads/ef;
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dh;->getThreadViewSpringyPositioner()Lcom/facebook/orca/chatheads/ef;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 1

    .prologue
    .line 176
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dh;->a()V

    .line 177
    return-void
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
    .line 184
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dh;->b()Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dh;->g()V

    .line 193
    return-void
.end method

.method public f()V
    .locals 1

    .prologue
    .line 201
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dh;->h()V

    .line 202
    return-void
.end method

.method public g()Landroid/graphics/PointF;
    .locals 1

    .prologue
    .line 215
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dh;->getNubTarget()Landroid/graphics/PointF;

    move-result-object v0

    return-object v0
.end method

.method public h()V
    .locals 1

    .prologue
    .line 222
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dh;->c()V

    .line 223
    return-void
.end method

.method public i()V
    .locals 2

    .prologue
    .line 230
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dc;->j()V

    .line 231
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->c:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 232
    return-void
.end method

.method public j()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 244
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/dh;->setEmojiKeyboardWindowControl(Lcom/facebook/orca/emoji/ah;)V

    .line 245
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/dh;->setEmojiKeyboardWindowControlListener(Lcom/facebook/orca/emoji/ai;)V

    .line 246
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/dh;->setListener(Lcom/facebook/orca/chatheads/dt;)V

    .line 247
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->d:Lcom/facebook/orca/chatheads/dh;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dh;->d()V

    .line 248
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->e:Lcom/facebook/orca/chatheads/dg;

    if-eqz v0, :cond_0

    .line 249
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dc;->e:Lcom/facebook/orca/chatheads/dg;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dg;->b()V

    .line 251
    :cond_0
    return-void
.end method
