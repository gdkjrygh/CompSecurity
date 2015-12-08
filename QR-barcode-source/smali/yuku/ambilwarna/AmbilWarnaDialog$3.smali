.class Lyuku/ambilwarna/AmbilWarnaDialog$3;
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
    iput-object p1, p0, Lyuku/ambilwarna/AmbilWarnaDialog$3;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    .line 146
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 7
    .param p1, "v"    # Landroid/view/View;
    .param p2, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v2, 0x1

    const/4 v6, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    .line 149
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    .line 150
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    if-eqz v3, :cond_0

    .line 151
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    if-ne v3, v2, :cond_5

    .line 153
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 154
    .local v0, "x":F
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    .line 156
    .local v1, "y":F
    cmpg-float v3, v0, v6

    if-gez v3, :cond_1

    const/4 v0, 0x0

    .line 157
    :cond_1
    iget-object v3, p0, Lyuku/ambilwarna/AmbilWarnaDialog$3;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    iget-object v3, v3, Lyuku/ambilwarna/AmbilWarnaDialog;->viewSatVal:Lyuku/ambilwarna/AmbilWarnaSquare;

    invoke-virtual {v3}, Lyuku/ambilwarna/AmbilWarnaSquare;->getMeasuredWidth()I

    move-result v3

    int-to-float v3, v3

    cmpl-float v3, v0, v3

    if-lez v3, :cond_2

    iget-object v3, p0, Lyuku/ambilwarna/AmbilWarnaDialog$3;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    iget-object v3, v3, Lyuku/ambilwarna/AmbilWarnaDialog;->viewSatVal:Lyuku/ambilwarna/AmbilWarnaSquare;

    invoke-virtual {v3}, Lyuku/ambilwarna/AmbilWarnaSquare;->getMeasuredWidth()I

    move-result v3

    int-to-float v0, v3

    .line 158
    :cond_2
    cmpg-float v3, v1, v6

    if-gez v3, :cond_3

    const/4 v1, 0x0

    .line 159
    :cond_3
    iget-object v3, p0, Lyuku/ambilwarna/AmbilWarnaDialog$3;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    iget-object v3, v3, Lyuku/ambilwarna/AmbilWarnaDialog;->viewSatVal:Lyuku/ambilwarna/AmbilWarnaSquare;

    invoke-virtual {v3}, Lyuku/ambilwarna/AmbilWarnaSquare;->getMeasuredHeight()I

    move-result v3

    int-to-float v3, v3

    cmpl-float v3, v1, v3

    if-lez v3, :cond_4

    iget-object v3, p0, Lyuku/ambilwarna/AmbilWarnaDialog$3;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    iget-object v3, v3, Lyuku/ambilwarna/AmbilWarnaDialog;->viewSatVal:Lyuku/ambilwarna/AmbilWarnaSquare;

    invoke-virtual {v3}, Lyuku/ambilwarna/AmbilWarnaSquare;->getMeasuredHeight()I

    move-result v3

    int-to-float v1, v3

    .line 161
    :cond_4
    iget-object v3, p0, Lyuku/ambilwarna/AmbilWarnaDialog$3;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    iget-object v4, p0, Lyuku/ambilwarna/AmbilWarnaDialog$3;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    iget-object v4, v4, Lyuku/ambilwarna/AmbilWarnaDialog;->viewSatVal:Lyuku/ambilwarna/AmbilWarnaSquare;

    invoke-virtual {v4}, Lyuku/ambilwarna/AmbilWarnaSquare;->getMeasuredWidth()I

    move-result v4

    int-to-float v4, v4

    div-float v4, v5, v4

    mul-float/2addr v4, v0

    # invokes: Lyuku/ambilwarna/AmbilWarnaDialog;->setSat(F)V
    invoke-static {v3, v4}, Lyuku/ambilwarna/AmbilWarnaDialog;->access$5(Lyuku/ambilwarna/AmbilWarnaDialog;F)V

    .line 162
    iget-object v3, p0, Lyuku/ambilwarna/AmbilWarnaDialog$3;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    iget-object v4, p0, Lyuku/ambilwarna/AmbilWarnaDialog$3;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    iget-object v4, v4, Lyuku/ambilwarna/AmbilWarnaDialog;->viewSatVal:Lyuku/ambilwarna/AmbilWarnaSquare;

    invoke-virtual {v4}, Lyuku/ambilwarna/AmbilWarnaSquare;->getMeasuredHeight()I

    move-result v4

    int-to-float v4, v4

    div-float v4, v5, v4

    mul-float/2addr v4, v1

    sub-float v4, v5, v4

    # invokes: Lyuku/ambilwarna/AmbilWarnaDialog;->setVal(F)V
    invoke-static {v3, v4}, Lyuku/ambilwarna/AmbilWarnaDialog;->access$6(Lyuku/ambilwarna/AmbilWarnaDialog;F)V

    .line 165
    iget-object v3, p0, Lyuku/ambilwarna/AmbilWarnaDialog$3;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    invoke-virtual {v3}, Lyuku/ambilwarna/AmbilWarnaDialog;->moveTarget()V

    .line 166
    iget-object v3, p0, Lyuku/ambilwarna/AmbilWarnaDialog$3;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    iget-object v3, v3, Lyuku/ambilwarna/AmbilWarnaDialog;->viewNewColor:Landroid/view/View;

    iget-object v4, p0, Lyuku/ambilwarna/AmbilWarnaDialog$3;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    # invokes: Lyuku/ambilwarna/AmbilWarnaDialog;->getColor()I
    invoke-static {v4}, Lyuku/ambilwarna/AmbilWarnaDialog;->access$2(Lyuku/ambilwarna/AmbilWarnaDialog;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 170
    .end local v0    # "x":F
    .end local v1    # "y":F
    :goto_0
    return v2

    :cond_5
    const/4 v2, 0x0

    goto :goto_0
.end method
