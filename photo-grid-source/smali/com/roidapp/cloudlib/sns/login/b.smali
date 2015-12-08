.class final Lcom/roidapp/cloudlib/sns/login/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/aj;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/login/a;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/login/a;)V
    .locals 0

    .prologue
    .line 202
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/login/b;->a:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/b;->a:Lcom/roidapp/cloudlib/sns/login/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/login/a;->a(Lcom/roidapp/cloudlib/sns/login/a;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/main/b;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/main/b;->r()V

    .line 206
    return-void
.end method
