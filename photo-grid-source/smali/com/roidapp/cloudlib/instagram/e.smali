.class final Lcom/roidapp/cloudlib/instagram/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;)V
    .locals 0

    .prologue
    .line 165
    iput-object p1, p0, Lcom/roidapp/cloudlib/instagram/e;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/e;->a:Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;->finish()V

    .line 169
    return-void
.end method
