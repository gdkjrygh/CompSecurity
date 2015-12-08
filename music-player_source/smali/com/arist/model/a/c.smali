.class final Lcom/arist/model/a/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field final synthetic a:Lcom/arist/model/a/b;


# direct methods
.method constructor <init>(Lcom/arist/model/a/b;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/a/c;->a:Lcom/arist/model/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Lcom/arist/b/b;

    check-cast p2, Lcom/arist/b/b;

    invoke-virtual {p1}, Lcom/arist/b/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/arist/b/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    return v0
.end method
