.class final Lcom/roidapp/photogrid/ak;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/AlertDialog;

.field final synthetic b:Lcom/roidapp/photogrid/MainPage;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/MainPage;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 2752
    iput-object p1, p0, Lcom/roidapp/photogrid/ak;->b:Lcom/roidapp/photogrid/MainPage;

    iput-object p2, p0, Lcom/roidapp/photogrid/ak;->a:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 2755
    iget-object v0, p0, Lcom/roidapp/photogrid/ak;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 2756
    return-void
.end method
