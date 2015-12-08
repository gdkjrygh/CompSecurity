.class Lyuku/ambilwarna/AmbilWarnaDialog$1;
.super Ljava/lang/Object;
.source "AmbilWarnaDialog.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyuku/ambilwarna/AmbilWarnaDialog;-><init>(Landroid/content/Context;IZLyuku/ambilwarna/AmbilWarnaDialog$OnAmbilWarnaListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lyuku/ambilwarna/AmbilWarnaDialog;


# direct methods
.method constructor <init>(Lyuku/ambilwarna/AmbilWarnaDialog;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lyuku/ambilwarna/AmbilWarnaDialog$1;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6
    .param p1, "v"    # Landroid/view/View;
    .param p2, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v2, 0x1

    const/high16 v5, 0x43b40000    # 360.0f

    .line 95
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    .line 96
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    if-eqz v3, :cond_0

    .line 97
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    if-ne v3, v2, :cond_4

    .line 99
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    .line 100
    .local v1, "y":F
    const/4 v3, 0x0

    cmpg-float v3, v1, v3

    if-gez v3, :cond_1

    const/4 v1, 0x0

    .line 101
    :cond_1
    iget-object v3, p0, Lyuku/ambilwarna/AmbilWarnaDialog$1;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    iget-object v3, v3, Lyuku/ambilwarna/AmbilWarnaDialog;->viewHue:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    int-to-float v3, v3

    cmpl-float v3, v1, v3

    if-lez v3, :cond_2

    .line 102
    iget-object v3, p0, Lyuku/ambilwarna/AmbilWarnaDialog$1;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    iget-object v3, v3, Lyuku/ambilwarna/AmbilWarnaDialog;->viewHue:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    int-to-float v3, v3

    const v4, 0x3a83126f    # 0.001f

    sub-float v1, v3, v4

    .line 104
    :cond_2
    iget-object v3, p0, Lyuku/ambilwarna/AmbilWarnaDialog$1;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    iget-object v3, v3, Lyuku/ambilwarna/AmbilWarnaDialog;->viewHue:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    int-to-float v3, v3

    div-float v3, v5, v3

    mul-float/2addr v3, v1

    sub-float v0, v5, v3

    .line 105
    .local v0, "hue":F
    cmpl-float v3, v0, v5

    if-nez v3, :cond_3

    const/4 v0, 0x0

    .line 106
    :cond_3
    iget-object v3, p0, Lyuku/ambilwarna/AmbilWarnaDialog$1;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    # invokes: Lyuku/ambilwarna/AmbilWarnaDialog;->setHue(F)V
    invoke-static {v3, v0}, Lyuku/ambilwarna/AmbilWarnaDialog;->access$0(Lyuku/ambilwarna/AmbilWarnaDialog;F)V

    .line 109
    iget-object v3, p0, Lyuku/ambilwarna/AmbilWarnaDialog$1;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    iget-object v3, v3, Lyuku/ambilwarna/AmbilWarnaDialog;->viewSatVal:Lyuku/ambilwarna/AmbilWarnaSquare;

    iget-object v4, p0, Lyuku/ambilwarna/AmbilWarnaDialog$1;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    # invokes: Lyuku/ambilwarna/AmbilWarnaDialog;->getHue()F
    invoke-static {v4}, Lyuku/ambilwarna/AmbilWarnaDialog;->access$1(Lyuku/ambilwarna/AmbilWarnaDialog;)F

    move-result v4

    invoke-virtual {v3, v4}, Lyuku/ambilwarna/AmbilWarnaSquare;->setHue(F)V

    .line 110
    iget-object v3, p0, Lyuku/ambilwarna/AmbilWarnaDialog$1;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    invoke-virtual {v3}, Lyuku/ambilwarna/AmbilWarnaDialog;->moveCursor()V

    .line 111
    iget-object v3, p0, Lyuku/ambilwarna/AmbilWarnaDialog$1;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    iget-object v3, v3, Lyuku/ambilwarna/AmbilWarnaDialog;->viewNewColor:Landroid/view/View;

    iget-object v4, p0, Lyuku/ambilwarna/AmbilWarnaDialog$1;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    # invokes: Lyuku/ambilwarna/AmbilWarnaDialog;->getColor()I
    invoke-static {v4}, Lyuku/ambilwarna/AmbilWarnaDialog;->access$2(Lyuku/ambilwarna/AmbilWarnaDialog;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 112
    iget-object v3, p0, Lyuku/ambilwarna/AmbilWarnaDialog$1;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    # invokes: Lyuku/ambilwarna/AmbilWarnaDialog;->updateAlphaView()V
    invoke-static {v3}, Lyuku/ambilwarna/AmbilWarnaDialog;->access$3(Lyuku/ambilwarna/AmbilWarnaDialog;)V

    .line 115
    .end local v0    # "hue":F
    .end local v1    # "y":F
    :goto_0
    return v2

    :cond_4
    const/4 v2, 0x0

    goto :goto_0
.end method
