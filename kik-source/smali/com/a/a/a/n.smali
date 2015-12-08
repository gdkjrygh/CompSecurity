.class final Lcom/a/a/a/n;
.super Lb/a/a/a/a/b/a;
.source "SourceFile"

# interfaces
.implements Lb/a/a/a/a/d/p;


# instance fields
.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lb/a/a/a/l;Ljava/lang/String;Ljava/lang/String;Lb/a/a/a/a/e/g;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 28
    sget v5, Lb/a/a/a/a/e/c;->b:I

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lb/a/a/a/a/b/a;-><init>(Lb/a/a/a/l;Ljava/lang/String;Ljava/lang/String;Lb/a/a/a/a/e/g;I)V

    .line 29
    iput-object p5, p0, Lcom/a/a/a/n;->b:Ljava/lang/String;

    .line 30
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Z
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 34
    invoke-virtual {p0}, Lcom/a/a/a/n;->b()Lb/a/a/a/a/e/d;

    move-result-object v0

    .line 35
    iget-object v1, p0, Lcom/a/a/a/n;->b:Ljava/lang/String;

    const-string v3, "X-CRASHLYTICS-API-CLIENT-TYPE"

    const-string v4, "android"

    invoke-virtual {v0, v3, v4}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    move-result-object v0

    const-string v3, "X-CRASHLYTICS-API-CLIENT-VERSION"

    invoke-static {}, Lcom/a/a/a/a;->c()Lcom/a/a/a/a;

    const-string v4, "1.2.2.56"

    invoke-virtual {v0, v3, v4}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    move-result-object v0

    const-string v3, "X-CRASHLYTICS-API-KEY"

    invoke-virtual {v0, v3, v1}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/e/d;

    move-result-object v3

    .line 36
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v2

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-static {}, Lcom/a/a/a/a;->c()Lcom/a/a/a/a;

    move-result-object v5

    invoke-virtual {v5}, Lcom/a/a/a/a;->v()Landroid/content/Context;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Adding analytics session file "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " to multipart POST"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Lb/a/a/a/a/b/j;->e(Landroid/content/Context;)V

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "session_analytics_file_"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "application/vnd.crashlytics.android.events"

    invoke-virtual {v3, v5, v6, v7, v0}, Lb/a/a/a/a/e/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Lb/a/a/a/a/e/d;

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 38
    :cond_0
    invoke-static {}, Lcom/a/a/a/a;->c()Lcom/a/a/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/a/a;->v()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Sending "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, " analytics files to "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/a/a/a/n;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lb/a/a/a/a/b/j;->e(Landroid/content/Context;)V

    .line 40
    invoke-virtual {v3}, Lb/a/a/a/a/e/d;->b()I

    move-result v0

    .line 41
    invoke-static {}, Lcom/a/a/a/a;->c()Lcom/a/a/a/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/a/a/a/a;->v()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lb/a/a/a/a/b/j;->e(Landroid/content/Context;)V

    .line 44
    invoke-static {v0}, Lb/a/a/a/a/b/y;->a(I)I

    move-result v0

    if-nez v0, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2
.end method
