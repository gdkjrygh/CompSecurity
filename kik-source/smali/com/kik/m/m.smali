.class public final Lcom/kik/m/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lkik/a/d/s;)Ljava/util/List;
    .locals 5

    .prologue
    const/4 v2, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 29
    const-class v0, Lkik/a/d/a/h;

    invoke-static {p0, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/h;

    .line 30
    if-eqz v0, :cond_0

    .line 31
    invoke-virtual {v0}, Lkik/a/d/a/h;->a()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/String;

    const-string v2, "http://"

    aput-object v2, v1, v3

    const-string v2, "https://"

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Lkik/android/util/v;->a(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 37
    :goto_0
    return-object v0

    .line 33
    :cond_0
    const-class v0, Lkik/a/d/a/a;

    invoke-static {p0, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 34
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/f/a/a/a;

    invoke-virtual {v1}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 35
    invoke-virtual {v0}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/f/a/a/a;

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/String;

    const-string v2, "http://"

    aput-object v2, v1, v3

    const-string v2, "https://"

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Lkik/android/util/v;->a(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 37
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0
.end method
