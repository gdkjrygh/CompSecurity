.class final Lkik/android/widget/aa$d;
.super Lkik/android/util/bf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/widget/aa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field a:Lcom/kik/g/p;

.field final synthetic b:Lkik/android/widget/aa;


# direct methods
.method constructor <init>(Lkik/android/widget/aa;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 308
    iput-object p1, p0, Lkik/android/widget/aa$d;->b:Lkik/android/widget/aa;

    invoke-direct {p0}, Lkik/android/util/bf;-><init>()V

    .line 309
    iput-object p2, p0, Lkik/android/widget/aa$d;->a:Lcom/kik/g/p;

    .line 310
    return-void
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .prologue
    .line 303
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Lkik/android/widget/aa$d;->b:Lkik/android/widget/aa;

    invoke-static {v0}, Lkik/android/widget/aa;->e(Lkik/android/widget/aa;)[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_2

    aget-object v4, v2, v0

    iget-object v5, p0, Lkik/android/widget/aa$d;->b:Lkik/android/widget/aa;

    invoke-static {v5}, Lkik/android/widget/aa;->d(Lkik/android/widget/aa;)Lkik/android/widget/GalleryWidget;

    move-result-object v5

    invoke-virtual {v5, v4}, Lkik/android/widget/GalleryWidget;->a(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-interface {v5}, Landroid/database/Cursor;->getCount()I

    move-result v6

    if-lez v6, :cond_0

    new-instance v6, Lkik/android/widget/aa$b;

    iget-object v7, p0, Lkik/android/widget/aa$d;->b:Lkik/android/widget/aa;

    invoke-direct {v6, v7}, Lkik/android/widget/aa$b;-><init>(Lkik/android/widget/aa;)V

    iput-object v4, v6, Lkik/android/widget/aa$b;->a:Ljava/lang/String;

    iget-object v7, p0, Lkik/android/widget/aa$d;->b:Lkik/android/widget/aa;

    invoke-static {v7}, Lkik/android/widget/aa;->f(Lkik/android/widget/aa;)I

    move-result v7

    invoke-interface {v5, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    iput-wide v8, v6, Lkik/android/widget/aa$b;->b:J

    invoke-interface {v5}, Landroid/database/Cursor;->getCount()I

    move-result v7

    iput v7, v6, Lkik/android/widget/aa$b;->c:I

    invoke-static {v5}, Lkik/android/widget/aa;->a(Landroid/database/Cursor;)Z

    move-result v7

    iput-boolean v7, v6, Lkik/android/widget/aa$b;->d:Z

    invoke-interface {v1, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 303
    check-cast p1, Ljava/util/Map;

    iget-object v0, p0, Lkik/android/widget/aa$d;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    return-void
.end method
