.class public final Lcom/arist/model/lrc/i;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 9

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    sget-object v3, Lcom/arist/c/a;->F:Ljava/lang/String;

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    move-object v0, v2

    :goto_0
    return-object v0

    :cond_3
    invoke-virtual {v4}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_4

    array-length v3, v4

    if-nez v3, :cond_5

    :cond_4
    move-object v0, v2

    goto :goto_0

    :cond_5
    if-eqz p0, :cond_6

    move v3, v0

    :goto_1
    if-eqz p1, :cond_7

    :goto_2
    array-length v5, v4

    :goto_3
    if-lt v1, v5, :cond_8

    move-object v0, v2

    goto :goto_0

    :cond_6
    move v3, v1

    goto :goto_1

    :cond_7
    move v0, v1

    goto :goto_2

    :cond_8
    aget-object v6, v4, v1

    if-eqz v6, :cond_b

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v7

    const-string v8, ".lrc"

    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_b

    if-eqz v3, :cond_9

    invoke-virtual {v7, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_a

    :cond_9
    if-eqz v0, :cond_b

    invoke-virtual {v7, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_b

    :cond_a
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_b
    add-int/lit8 v1, v1, 0x1

    goto :goto_3
.end method


# virtual methods
.method public final a(Lcom/arist/activity/MusicPlayActivity;Lcom/arist/b/b;)V
    .locals 8

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v2

    invoke-virtual {p1}, Lcom/arist/activity/MusicPlayActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v3

    const v0, 0x7f030012

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    const v0, 0x7f060062

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ListView;

    const-string v1, ""

    const-string v0, ""

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/arist/b/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/arist/b/b;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/c/c;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    new-instance v4, Lcom/arist/model/lrc/m;

    invoke-static {v1, v0}, Lcom/arist/model/lrc/i;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v4, p0, v3, v0}, Lcom/arist/model/lrc/m;-><init>(Lcom/arist/model/lrc/i;Landroid/view/LayoutInflater;Ljava/util/List;)V

    invoke-virtual {v6, v4}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    new-instance v0, Lcom/arist/model/lrc/j;

    move-object v1, p0

    move-object v3, p2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/arist/model/lrc/j;-><init>(Lcom/arist/model/lrc/i;Landroid/app/AlertDialog;Lcom/arist/b/b;Lcom/arist/model/lrc/m;Lcom/arist/activity/MusicPlayActivity;)V

    invoke-virtual {v6, v0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    const v0, 0x7f060064

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/arist/model/lrc/k;

    invoke-direct {v1, p0, v2, p1, p2}, Lcom/arist/model/lrc/k;-><init>(Lcom/arist/model/lrc/i;Landroid/app/AlertDialog;Lcom/arist/activity/MusicPlayActivity;Lcom/arist/b/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f060063

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/arist/model/lrc/l;

    invoke-direct {v1, p0, v2, p2, p1}, Lcom/arist/model/lrc/l;-><init>(Lcom/arist/model/lrc/i;Landroid/app/AlertDialog;Lcom/arist/b/b;Lcom/arist/activity/MusicPlayActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v2, v7}, Landroid/app/AlertDialog;->setView(Landroid/view/View;)V

    invoke-virtual {v2}, Landroid/app/AlertDialog;->show()V

    return-void
.end method
