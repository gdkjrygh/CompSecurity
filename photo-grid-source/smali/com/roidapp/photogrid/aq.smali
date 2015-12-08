.class final Lcom/roidapp/photogrid/aq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/MainPage;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/MainPage;)V
    .locals 0

    .prologue
    .line 1204
    iput-object p1, p0, Lcom/roidapp/photogrid/aq;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 1208
    const/4 v0, 0x1

    iget-object v1, p0, Lcom/roidapp/photogrid/aq;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/social/c;->a(ZLandroid/app/Activity;)V

    .line 1209
    return-void
.end method
