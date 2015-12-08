.class Lcom/kik/l/a$a;
.super Lcom/kik/l/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/l/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Landroid/database/Cursor;)V
    .locals 0

    .prologue
    .line 292
    invoke-direct {p0, p1}, Lcom/kik/l/y;-><init>(Landroid/database/Cursor;)V

    .line 293
    return-void
.end method

.method public static a(Lkik/a/a/a;)Landroid/content/ContentValues;
    .locals 3

    .prologue
    .line 297
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 299
    if-nez p0, :cond_1

    .line 300
    const/4 v0, 0x0

    .line 318
    :cond_0
    :goto_0
    return-object v0

    .line 303
    :cond_1
    invoke-virtual {p0}, Lkik/a/a/a;->a()Ljava/lang/String;

    move-result-object v1

    .line 304
    if-eqz v1, :cond_2

    .line 305
    const-string v1, "name"

    invoke-virtual {p0}, Lkik/a/a/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    :cond_2
    invoke-virtual {p0}, Lkik/a/a/a;->b()Ljava/lang/String;

    move-result-object v1

    .line 309
    if-eqz v1, :cond_3

    .line 310
    const-string v1, "variant"

    invoke-virtual {p0}, Lkik/a/a/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    :cond_3
    invoke-virtual {p0}, Lkik/a/a/a;->c()Ljava/lang/String;

    move-result-object v1

    .line 314
    if-eqz v1, :cond_0

    .line 315
    const-string v1, "experiment_id"

    invoke-virtual {p0}, Lkik/a/a/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public final a()Lkik/a/a/a;
    .locals 3

    .prologue
    .line 323
    const-string v0, "name"

    invoke-virtual {p0, v0}, Lcom/kik/l/a$a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 324
    const-string v0, "variant"

    invoke-virtual {p0, v0}, Lcom/kik/l/a$a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 326
    if-eqz v1, :cond_0

    if-nez v2, :cond_2

    .line 327
    :cond_0
    const/4 v0, 0x0

    .line 336
    :cond_1
    :goto_0
    return-object v0

    .line 330
    :cond_2
    new-instance v0, Lkik/a/a/a;

    invoke-direct {v0, v1, v2}, Lkik/a/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    const-string v1, "experiment_id"

    invoke-virtual {p0, v1}, Lcom/kik/l/a$a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 332
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    .line 333
    invoke-virtual {v0, v1}, Lkik/a/a/a;->a(Ljava/lang/String;)V

    goto :goto_0
.end method
