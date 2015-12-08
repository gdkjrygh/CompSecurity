.class final Lcom/b/a/a/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Lcom/b/a/a/b;


# direct methods
.method public constructor <init>(Lcom/b/a/a/b;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/b/a/a/v;->a:Lcom/b/a/a/b;

    .line 19
    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;Lcom/b/a/a/z;)V
    .locals 3

    .prologue
    .line 60
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Logged lifecycle event: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/b/a/a/z;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    iget-object v0, p0, Lcom/b/a/a/v;->a:Lcom/b/a/a/b;

    .line 1040
    const-string v1, "activity"

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    .line 1042
    new-instance v2, Lcom/b/a/a/y;

    invoke-direct {v2, p2}, Lcom/b/a/a/y;-><init>(Lcom/b/a/a/z;)V

    .line 1107
    iput-object v1, v2, Lcom/b/a/a/y;->c:Ljava/util/Map;

    .line 61
    invoke-virtual {v0, v2}, Lcom/b/a/a/b;->a(Lcom/b/a/a/y;)V

    .line 62
    return-void
.end method
