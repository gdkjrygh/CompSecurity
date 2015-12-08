.class final Lcom/roidapp/cloudlib/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/b;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/b;)V
    .locals 0

    .prologue
    .line 145
    iput-object p1, p0, Lcom/roidapp/cloudlib/c;->a:Lcom/roidapp/cloudlib/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Lcom/roidapp/cloudlib/c;->a:Lcom/roidapp/cloudlib/b;

    iget-object v0, v0, Lcom/roidapp/cloudlib/b;->a:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->b(Lcom/roidapp/cloudlib/AccountMgrActivity;)V

    .line 149
    return-void
.end method
