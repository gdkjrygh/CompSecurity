.class Lorg/chromium/ui/picker/TwoFieldDatePicker$1;
.super Ljava/lang/Object;
.source "TwoFieldDatePicker.java"

# interfaces
.implements Landroid/widget/NumberPicker$OnValueChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/ui/picker/TwoFieldDatePicker;-><init>(Landroid/content/Context;DD)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/ui/picker/TwoFieldDatePicker;


# direct methods
.method constructor <init>(Lorg/chromium/ui/picker/TwoFieldDatePicker;)V
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Lorg/chromium/ui/picker/TwoFieldDatePicker$1;->this$0:Lorg/chromium/ui/picker/TwoFieldDatePicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onValueChange(Landroid/widget/NumberPicker;II)V
    .locals 3
    .param p1, "picker"    # Landroid/widget/NumberPicker;
    .param p2, "oldVal"    # I
    .param p3, "newVal"    # I

    .prologue
    .line 65
    iget-object v2, p0, Lorg/chromium/ui/picker/TwoFieldDatePicker$1;->this$0:Lorg/chromium/ui/picker/TwoFieldDatePicker;

    invoke-virtual {v2}, Lorg/chromium/ui/picker/TwoFieldDatePicker;->getYear()I

    move-result v1

    .line 66
    .local v1, "year":I
    iget-object v2, p0, Lorg/chromium/ui/picker/TwoFieldDatePicker$1;->this$0:Lorg/chromium/ui/picker/TwoFieldDatePicker;

    invoke-virtual {v2}, Lorg/chromium/ui/picker/TwoFieldDatePicker;->getPositionInYear()I

    move-result v0

    .line 68
    .local v0, "positionInYear":I
    iget-object v2, p0, Lorg/chromium/ui/picker/TwoFieldDatePicker$1;->this$0:Lorg/chromium/ui/picker/TwoFieldDatePicker;

    # getter for: Lorg/chromium/ui/picker/TwoFieldDatePicker;->mPositionInYearSpinner:Landroid/widget/NumberPicker;
    invoke-static {v2}, Lorg/chromium/ui/picker/TwoFieldDatePicker;->access$000(Lorg/chromium/ui/picker/TwoFieldDatePicker;)Landroid/widget/NumberPicker;

    move-result-object v2

    if-ne p1, v2, :cond_2

    .line 69
    move v0, p3

    .line 70
    invoke-virtual {p1}, Landroid/widget/NumberPicker;->getMaxValue()I

    move-result v2

    if-ne p2, v2, :cond_1

    invoke-virtual {p1}, Landroid/widget/NumberPicker;->getMinValue()I

    move-result v2

    if-ne p3, v2, :cond_1

    .line 71
    add-int/lit8 v1, v1, 0x1

    .line 72
    iget-object v2, p0, Lorg/chromium/ui/picker/TwoFieldDatePicker$1;->this$0:Lorg/chromium/ui/picker/TwoFieldDatePicker;

    invoke-virtual {v2, v1}, Lorg/chromium/ui/picker/TwoFieldDatePicker;->getMinPositionInYear(I)I

    move-result v0

    .line 84
    :cond_0
    :goto_0
    iget-object v2, p0, Lorg/chromium/ui/picker/TwoFieldDatePicker$1;->this$0:Lorg/chromium/ui/picker/TwoFieldDatePicker;

    invoke-virtual {v2, v1, v0}, Lorg/chromium/ui/picker/TwoFieldDatePicker;->setCurrentDate(II)V

    .line 85
    iget-object v2, p0, Lorg/chromium/ui/picker/TwoFieldDatePicker$1;->this$0:Lorg/chromium/ui/picker/TwoFieldDatePicker;

    invoke-virtual {v2}, Lorg/chromium/ui/picker/TwoFieldDatePicker;->updateSpinners()V

    .line 86
    iget-object v2, p0, Lorg/chromium/ui/picker/TwoFieldDatePicker$1;->this$0:Lorg/chromium/ui/picker/TwoFieldDatePicker;

    invoke-virtual {v2}, Lorg/chromium/ui/picker/TwoFieldDatePicker;->notifyDateChanged()V

    .line 87
    return-void

    .line 73
    :cond_1
    invoke-virtual {p1}, Landroid/widget/NumberPicker;->getMinValue()I

    move-result v2

    if-ne p2, v2, :cond_0

    invoke-virtual {p1}, Landroid/widget/NumberPicker;->getMaxValue()I

    move-result v2

    if-ne p3, v2, :cond_0

    .line 74
    add-int/lit8 v1, v1, -0x1

    .line 75
    iget-object v2, p0, Lorg/chromium/ui/picker/TwoFieldDatePicker$1;->this$0:Lorg/chromium/ui/picker/TwoFieldDatePicker;

    invoke-virtual {v2, v1}, Lorg/chromium/ui/picker/TwoFieldDatePicker;->getMaxPositionInYear(I)I

    move-result v0

    goto :goto_0

    .line 77
    :cond_2
    iget-object v2, p0, Lorg/chromium/ui/picker/TwoFieldDatePicker$1;->this$0:Lorg/chromium/ui/picker/TwoFieldDatePicker;

    # getter for: Lorg/chromium/ui/picker/TwoFieldDatePicker;->mYearSpinner:Landroid/widget/NumberPicker;
    invoke-static {v2}, Lorg/chromium/ui/picker/TwoFieldDatePicker;->access$100(Lorg/chromium/ui/picker/TwoFieldDatePicker;)Landroid/widget/NumberPicker;

    move-result-object v2

    if-ne p1, v2, :cond_3

    .line 78
    move v1, p3

    goto :goto_0

    .line 80
    :cond_3
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v2
.end method
