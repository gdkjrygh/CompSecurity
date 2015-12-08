.class public final Lcom/b/a/a;
.super La/a/a/a/p;
.source "SourceFile"

# interfaces
.implements La/a/a/a/q;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/a/a/a/p",
        "<",
        "Ljava/lang/Void;",
        ">;",
        "La/a/a/a/q;"
    }
.end annotation


# instance fields
.field public final a:Lcom/b/a/a/a;

.field public final b:Lcom/b/a/b/e;

.field public final c:Lcom/b/a/c/h;

.field public final d:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<+",
            "La/a/a/a/p;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 29
    new-instance v0, Lcom/b/a/a/a;

    invoke-direct {v0}, Lcom/b/a/a/a;-><init>()V

    new-instance v1, Lcom/b/a/b/e;

    invoke-direct {v1}, Lcom/b/a/b/e;-><init>()V

    new-instance v2, Lcom/b/a/c/h;

    invoke-direct {v2}, Lcom/b/a/c/h;-><init>()V

    invoke-direct {p0, v0, v1, v2}, Lcom/b/a/a;-><init>(Lcom/b/a/a/a;Lcom/b/a/b/e;Lcom/b/a/c/h;)V

    .line 30
    return-void
.end method

.method constructor <init>(Lcom/b/a/a/a;Lcom/b/a/b/e;Lcom/b/a/c/h;)V
    .locals 2

    .prologue
    .line 32
    invoke-direct {p0}, La/a/a/a/p;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/b/a/a;->a:Lcom/b/a/a/a;

    .line 34
    iput-object p2, p0, Lcom/b/a/a;->b:Lcom/b/a/b/e;

    .line 35
    iput-object p3, p0, Lcom/b/a/a;->c:Lcom/b/a/c/h;

    .line 37
    const/4 v0, 0x3

    new-array v0, v0, [La/a/a/a/p;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 v1, 0x1

    aput-object p2, v0, v1

    const/4 v1, 0x2

    aput-object p3, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    iput-object v0, p0, Lcom/b/a/a;->d:Ljava/util/Collection;

    .line 38
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 166
    const-string v0, "2.5.2.79"

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 171
    const-string v0, "com.crashlytics.sdk.android:crashlytics"

    return-object v0
.end method

.method public final c()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<+",
            "La/a/a/a/p;",
            ">;"
        }
    .end annotation

    .prologue
    .line 176
    iget-object v0, p0, Lcom/b/a/a;->d:Ljava/util/Collection;

    return-object v0
.end method

.method protected final bridge synthetic d()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 18
    const/4 v0, 0x0

    return-object v0
.end method
