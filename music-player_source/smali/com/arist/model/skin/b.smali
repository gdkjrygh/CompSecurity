.class public final Lcom/arist/model/skin/b;
.super Ljava/lang/Object;


# static fields
.field private static c:Lcom/arist/model/skin/b;


# instance fields
.field private a:I

.field private final b:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, -0xda6101

    iput v0, p0, Lcom/arist/model/skin/b;->a:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/model/skin/b;->b:Ljava/util/List;

    return-void
.end method

.method public static a()Lcom/arist/model/skin/b;
    .locals 1

    sget-object v0, Lcom/arist/model/skin/b;->c:Lcom/arist/model/skin/b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/arist/model/skin/b;

    invoke-direct {v0}, Lcom/arist/model/skin/b;-><init>()V

    sput-object v0, Lcom/arist/model/skin/b;->c:Lcom/arist/model/skin/b;

    :cond_0
    sget-object v0, Lcom/arist/model/skin/b;->c:Lcom/arist/model/skin/b;

    return-object v0
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    iget v0, p0, Lcom/arist/model/skin/b;->a:I

    if-ne v0, p1, :cond_1

    :cond_0
    return-void

    :cond_1
    iput p1, p0, Lcom/arist/model/skin/b;->a:I

    iget-object v0, p0, Lcom/arist/model/skin/b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/model/skin/m;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lcom/arist/model/skin/m;->a(I)V

    goto :goto_0
.end method

.method public final a(Landroid/content/Context;)V
    .locals 6

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0c0005

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v2

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v3, 0x7f030014

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    const v0, 0x7f060068

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    new-instance v4, Lcom/arist/model/skin/f;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v2, p1, v5}, Lcom/arist/model/skin/f;-><init>(Lcom/arist/model/skin/b;[ILandroid/content/Context;B)V

    invoke-virtual {v0, v4}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    new-instance v4, Lcom/arist/model/skin/c;

    invoke-direct {v4, p0, v2, v1}, Lcom/arist/model/skin/c;-><init>(Lcom/arist/model/skin/b;[ILandroid/app/AlertDialog;)V

    invoke-virtual {v0, v4}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    const v0, 0x7f060067

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v2, Lcom/arist/model/skin/d;

    invoke-direct {v2, p0, p1, v1}, Lcom/arist/model/skin/d;-><init>(Lcom/arist/model/skin/b;Landroid/content/Context;Landroid/app/AlertDialog;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v1, v3}, Landroid/app/AlertDialog;->setView(Landroid/view/View;)V

    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method public final a(Lcom/arist/model/skin/m;)V
    .locals 1

    iget-object v0, p0, Lcom/arist/model/skin/b;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    iget v0, p0, Lcom/arist/model/skin/b;->a:I

    invoke-interface {p1, v0}, Lcom/arist/model/skin/m;->a(I)V

    iget-object v0, p0, Lcom/arist/model/skin/b;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lcom/arist/model/skin/b;->a:I

    return v0
.end method

.method public final b(Lcom/arist/model/skin/m;)V
    .locals 1

    iget-object v0, p0, Lcom/arist/model/skin/b;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method
