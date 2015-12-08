.class final Lcom/roidapp/photogrid/release/ak;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)V
    .locals 0

    .prologue
    .line 314
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ak;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 316
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 317
    return-void
.end method
