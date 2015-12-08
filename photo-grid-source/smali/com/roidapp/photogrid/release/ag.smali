.class final Lcom/roidapp/photogrid/release/ag;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/af;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/af;)V
    .locals 0

    .prologue
    .line 21
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ag;->a:Lcom/roidapp/photogrid/release/af;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 24
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 25
    return-void
.end method
