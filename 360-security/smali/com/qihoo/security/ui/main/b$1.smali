.class Lcom/qihoo/security/ui/main/b$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/main/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/b;)V
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lcom/qihoo/security/ui/main/b$1;->a:Lcom/qihoo/security/ui/main/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x1

    return v0
.end method
