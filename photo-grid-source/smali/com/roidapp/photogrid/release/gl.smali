.class final Lcom/roidapp/photogrid/release/gl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ge;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ge;)V
    .locals 0

    .prologue
    .line 1259
    iput-object p1, p0, Lcom/roidapp/photogrid/release/gl;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 1264
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 1265
    return-void
.end method
