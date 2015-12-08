.class Lyuku/ambilwarna/AmbilWarnaDialog$2;
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
    iput-object p1, p0, Lyuku/ambilwarna/AmbilWarnaDialog$2;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8
    .param p1, "v"    # Landroid/view/View;
    .param p2, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v4, 0x1

    const/high16 v7, 0x437f0000    # 255.0f

    .line 122
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v5

    const/4 v6, 0x2

    if-eq v5, v6, :cond_0

    .line 123
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v5

    if-eqz v5, :cond_0

    .line 124
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v5

    if-ne v5, v4, :cond_3

    .line 126
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    .line 127
    .local v3, "y":F
    const/4 v5, 0x0

    cmpg-float v5, v3, v5

    if-gez v5, :cond_1

    .line 128
    const/4 v3, 0x0

    .line 130
    :cond_1
    iget-object v5, p0, Lyuku/ambilwarna/AmbilWarnaDialog$2;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    iget-object v5, v5, Lyuku/ambilwarna/AmbilWarnaDialog;->viewAlphaCheckered:Landroid/widget/ImageView;

    invoke-virtual {v5}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v5

    int-to-float v5, v5

    cmpl-float v5, v3, v5

    if-lez v5, :cond_2

    .line 131
    iget-object v5, p0, Lyuku/ambilwarna/AmbilWarnaDialog$2;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    iget-object v5, v5, Lyuku/ambilwarna/AmbilWarnaDialog;->viewAlphaCheckered:Landroid/widget/ImageView;

    invoke-virtual {v5}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v5

    int-to-float v5, v5

    const v6, 0x3a83126f    # 0.001f

    sub-float v3, v5, v6

    .line 133
    :cond_2
    iget-object v5, p0, Lyuku/ambilwarna/AmbilWarnaDialog$2;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    iget-object v5, v5, Lyuku/ambilwarna/AmbilWarnaDialog;->viewAlphaCheckered:Landroid/widget/ImageView;

    invoke-virtual {v5}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v5

    int-to-float v5, v5

    div-float v5, v7, v5

    mul-float/2addr v5, v3

    sub-float v5, v7, v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 134
    .local v0, "a":I
    iget-object v5, p0, Lyuku/ambilwarna/AmbilWarnaDialog$2;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    # invokes: Lyuku/ambilwarna/AmbilWarnaDialog;->setAlpha(I)V
    invoke-static {v5, v0}, Lyuku/ambilwarna/AmbilWarnaDialog;->access$4(Lyuku/ambilwarna/AmbilWarnaDialog;I)V

    .line 137
    iget-object v5, p0, Lyuku/ambilwarna/AmbilWarnaDialog$2;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    invoke-virtual {v5}, Lyuku/ambilwarna/AmbilWarnaDialog;->moveAlphaCursor()V

    .line 138
    iget-object v5, p0, Lyuku/ambilwarna/AmbilWarnaDialog$2;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    # invokes: Lyuku/ambilwarna/AmbilWarnaDialog;->getColor()I
    invoke-static {v5}, Lyuku/ambilwarna/AmbilWarnaDialog;->access$2(Lyuku/ambilwarna/AmbilWarnaDialog;)I

    move-result v2

    .line 139
    .local v2, "col":I
    shl-int/lit8 v5, v0, 0x18

    const v6, 0xffffff

    and-int/2addr v6, v2

    or-int v1, v5, v6

    .line 140
    .local v1, "c":I
    iget-object v5, p0, Lyuku/ambilwarna/AmbilWarnaDialog$2;->this$0:Lyuku/ambilwarna/AmbilWarnaDialog;

    iget-object v5, v5, Lyuku/ambilwarna/AmbilWarnaDialog;->viewNewColor:Landroid/view/View;

    invoke-virtual {v5, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 143
    .end local v0    # "a":I
    .end local v1    # "c":I
    .end local v2    # "col":I
    .end local v3    # "y":F
    :goto_0
    return v4

    :cond_3
    const/4 v4, 0x0

    goto :goto_0
.end method
