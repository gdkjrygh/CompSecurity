.class final Lcom/roidapp/photogrid/release/gg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ge;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ge;)V
    .locals 0

    .prologue
    .line 1181
    iput-object p1, p0, Lcom/roidapp/photogrid/release/gg;->a:Lcom/roidapp/photogrid/release/ge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 1186
    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    .line 1187
    const/4 v0, 0x1

    .line 1189
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
