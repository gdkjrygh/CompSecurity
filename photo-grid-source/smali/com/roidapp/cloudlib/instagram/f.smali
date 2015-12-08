.class final Lcom/roidapp/cloudlib/instagram/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)V
    .locals 0

    .prologue
    .line 232
    iput-object p1, p0, Lcom/roidapp/cloudlib/instagram/f;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 235
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/f;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->c(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)V

    .line 236
    return-void
.end method
