.class final Lcom/qihoo/security/a$1;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/a;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 116
    iput-object p1, p0, Lcom/qihoo/security/a$1;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 120
    iget-object v0, p0, Lcom/qihoo/security/a$1;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/h/h;->a(Landroid/content/Context;)V

    .line 121
    iget-object v0, p0, Lcom/qihoo/security/a$1;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070008

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 122
    invoke-static {}, Lcom/qihoo/security/app/e;->a()V

    .line 124
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/a$1;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/support/b;->a(Landroid/content/Context;)V

    .line 125
    const/16 v0, 0x2716

    invoke-static {v0}, Lcom/qihoo/security/support/b;->a(I)V

    .line 126
    return-void
.end method
