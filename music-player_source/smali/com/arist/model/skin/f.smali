.class final Lcom/arist/model/skin/f;
.super Landroid/widget/BaseAdapter;


# instance fields
.field a:[I

.field b:Landroid/content/Context;

.field c:Landroid/view/LayoutInflater;

.field final synthetic d:Lcom/arist/model/skin/b;


# direct methods
.method private constructor <init>(Lcom/arist/model/skin/b;[ILandroid/content/Context;)V
    .locals 1

    iput-object p1, p0, Lcom/arist/model/skin/f;->d:Lcom/arist/model/skin/b;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    iput-object p2, p0, Lcom/arist/model/skin/f;->a:[I

    iput-object p3, p0, Lcom/arist/model/skin/f;->b:Landroid/content/Context;

    invoke-static {p3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/skin/f;->c:Landroid/view/LayoutInflater;

    return-void
.end method

.method synthetic constructor <init>(Lcom/arist/model/skin/b;[ILandroid/content/Context;B)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/arist/model/skin/f;-><init>(Lcom/arist/model/skin/b;[ILandroid/content/Context;)V

    return-void
.end method

.method private a(I)Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/arist/model/skin/f;->a:[I

    aget v0, v0, p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    iget-object v0, p0, Lcom/arist/model/skin/f;->a:[I

    array-length v0, v0

    return v0
.end method

.method public final synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    invoke-direct {p0, p1}, Lcom/arist/model/skin/f;->a(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    iget-object v0, p0, Lcom/arist/model/skin/f;->c:Landroid/view/LayoutInflater;

    const v1, 0x7f03003e

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    const v0, 0x7f0600e2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/skin/ColorCircleView;

    invoke-direct {p0, p1}, Lcom/arist/model/skin/f;->a(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/arist/model/skin/ColorCircleView;->a(I)V

    return-object v1
.end method
