.class public Lcom/hmobile/biblekjv/PickColorActivity;
.super Lcom/hmobile/biblekjv/BaseActivity;
.source "PickColorActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field colors:[I

.field drawables:[I

.field private mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

.field private mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

.field txt1:Landroid/widget/TextView;

.field txt2:Landroid/widget/TextView;

.field txt3:Landroid/widget/TextView;

.field txt4:Landroid/widget/TextView;

.field txt5:Landroid/widget/TextView;

.field txt6:Landroid/widget/TextView;

.field txt7:Landroid/widget/TextView;

.field txt8:Landroid/widget/TextView;

.field private txtNoBookmark:Landroid/widget/TextView;

.field views:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/16 v1, 0x8

    .line 17
    invoke-direct {p0}, Lcom/hmobile/biblekjv/BaseActivity;-><init>()V

    .line 27
    new-array v0, v1, [I

    fill-array-data v0, :array_0

    .line 31
    iput-object v0, p0, Lcom/hmobile/biblekjv/PickColorActivity;->drawables:[I

    .line 33
    new-array v0, v1, [I

    const/4 v1, 0x1

    const-string v2, "#F56545"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "#FFBB22"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "#EEEE22"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "#b5c5c5"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "#66CCDD"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "#77DDBB"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "#BBE535"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    aput v2, v0, v1

    iput-object v0, p0, Lcom/hmobile/biblekjv/PickColorActivity;->colors:[I

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/PickColorActivity;->views:Ljava/util/ArrayList;

    .line 17
    return-void

    .line 27
    nop

    :array_0
    .array-data 4
        0x7f02008d
        0x7f020091
        0x7f020090
        0x7f02008c
        0x7f02008b
        0x7f02008f
        0x7f02008e
        0x7f02008a
    .end array-data
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 87
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget-object v2, p0, Lcom/hmobile/biblekjv/PickColorActivity;->views:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lt v0, v2, :cond_0

    .line 101
    :goto_1
    return-void

    .line 88
    :cond_0
    iget-object v2, p0, Lcom/hmobile/biblekjv/PickColorActivity;->views:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 89
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 90
    .local v1, "returnIntent":Landroid/content/Intent;
    const-string v2, "color"

    iget-object v3, p0, Lcom/hmobile/biblekjv/PickColorActivity;->colors:[I

    aget v3, v3, v0

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 91
    const/4 v2, -0x1

    invoke-virtual {p0, v2, v1}, Lcom/hmobile/biblekjv/PickColorActivity;->setResult(ILandroid/content/Intent;)V

    .line 92
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/PickColorActivity;->finish()V

    goto :goto_1

    .line 87
    .end local v1    # "returnIntent":Landroid/content/Intent;
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 38
    invoke-super {p0, p1}, Lcom/hmobile/biblekjv/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 39
    const v1, 0x7f030027

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/PickColorActivity;->setContentView(I)V

    .line 40
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/PickColorActivity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 41
    .local v0, "params":Landroid/view/WindowManager$LayoutParams;
    iget v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->screenWidth:I

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 42
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/PickColorActivity;->getWindow()Landroid/view/Window;

    move-result-object v1

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 43
    invoke-static {p0}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/analytics/tracking/android/GoogleAnalytics;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 45
    const v1, 0x7f0e00b7

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/PickColorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt1:Landroid/widget/TextView;

    .line 46
    const v1, 0x7f0e00b8

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/PickColorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt2:Landroid/widget/TextView;

    .line 47
    const v1, 0x7f0e00b9

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/PickColorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt3:Landroid/widget/TextView;

    .line 48
    const v1, 0x7f0e00ba

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/PickColorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt4:Landroid/widget/TextView;

    .line 49
    const v1, 0x7f0e00bb

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/PickColorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt5:Landroid/widget/TextView;

    .line 50
    const v1, 0x7f0e00bc

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/PickColorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt6:Landroid/widget/TextView;

    .line 51
    const v1, 0x7f0e00bd

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/PickColorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt7:Landroid/widget/TextView;

    .line 52
    const v1, 0x7f0e00be

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/PickColorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt8:Landroid/widget/TextView;

    .line 54
    iget-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 55
    const v2, 0x7f070092

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/PickColorActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getTracker(Ljava/lang/String;)Lcom/google/analytics/tracking/android/Tracker;

    move-result-object v1

    .line 54
    iput-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    .line 57
    iget-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    const-string v2, "/PickColorActivity"

    invoke-virtual {v1, v2}, Lcom/google/analytics/tracking/android/Tracker;->sendView(Ljava/lang/String;)V

    .line 59
    iget-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt1:Landroid/widget/TextView;

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    iget-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt2:Landroid/widget/TextView;

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    iget-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt3:Landroid/widget/TextView;

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    iget-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt4:Landroid/widget/TextView;

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    iget-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt5:Landroid/widget/TextView;

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    iget-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt6:Landroid/widget/TextView;

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    iget-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt7:Landroid/widget/TextView;

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 66
    iget-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt8:Landroid/widget/TextView;

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    iget-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->views:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt1:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    iget-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->views:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt2:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    iget-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->views:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt3:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    iget-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->views:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt4:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    iget-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->views:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt5:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    iget-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->views:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt6:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    iget-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->views:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt7:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    iget-object v1, p0, Lcom/hmobile/biblekjv/PickColorActivity;->views:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/hmobile/biblekjv/PickColorActivity;->txt8:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    return-void
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 82
    invoke-super {p0}, Lcom/hmobile/biblekjv/BaseActivity;->onResume()V

    .line 83
    return-void
.end method
