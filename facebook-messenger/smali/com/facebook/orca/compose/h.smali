.class final Lcom/facebook/orca/compose/h;
.super Ljava/lang/Object;
.source "AudioComposerView.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/compose/AudioComposerView;

.field private b:Landroid/net/Uri;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/compose/AudioComposerView;)V
    .locals 1

    .prologue
    .line 109
    iput-object p1, p0, Lcom/facebook/orca/compose/h;->a:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/compose/h;->b:Landroid/net/Uri;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/compose/AudioComposerView;Lcom/facebook/orca/compose/a;)V
    .locals 0

    .prologue
    .line 109
    invoke-direct {p0, p1}, Lcom/facebook/orca/compose/h;-><init>(Lcom/facebook/orca/compose/AudioComposerView;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 118
    invoke-virtual {p0}, Lcom/facebook/orca/compose/h;->b()Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 119
    iget-object v0, p0, Lcom/facebook/orca/compose/h;->b:Landroid/net/Uri;

    return-object v0
.end method

.method public a(Landroid/net/Uri;)V
    .locals 1

    .prologue
    .line 113
    invoke-virtual {p0}, Lcom/facebook/orca/compose/h;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 114
    iput-object p1, p0, Lcom/facebook/orca/compose/h;->b:Landroid/net/Uri;

    .line 115
    return-void

    .line 113
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/facebook/orca/compose/h;->b:Landroid/net/Uri;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()V
    .locals 1

    .prologue
    .line 130
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/compose/h;->b:Landroid/net/Uri;

    .line 131
    return-void
.end method

.method public d()V
    .locals 2

    .prologue
    .line 134
    iget-object v0, p0, Lcom/facebook/orca/compose/h;->a:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-virtual {p0}, Lcom/facebook/orca/compose/h;->a()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/orca/compose/AudioComposerView;->a(Lcom/facebook/orca/compose/AudioComposerView;Landroid/net/Uri;)V

    .line 135
    invoke-virtual {p0}, Lcom/facebook/orca/compose/h;->c()V

    .line 139
    iget-object v0, p0, Lcom/facebook/orca/compose/h;->a:Lcom/facebook/orca/compose/AudioComposerView;

    invoke-static {v0}, Lcom/facebook/orca/compose/AudioComposerView;->e(Lcom/facebook/orca/compose/AudioComposerView;)V

    .line 140
    return-void
.end method
