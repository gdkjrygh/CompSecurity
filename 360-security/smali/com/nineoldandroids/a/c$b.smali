.class public Lcom/nineoldandroids/a/c$b;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nineoldandroids/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/nineoldandroids/a/c;

.field private b:Lcom/nineoldandroids/a/c$e;


# direct methods
.method constructor <init>(Lcom/nineoldandroids/a/c;Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 1027
    iput-object p1, p0, Lcom/nineoldandroids/a/c$b;->a:Lcom/nineoldandroids/a/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1028
    invoke-static {p1}, Lcom/nineoldandroids/a/c;->b(Lcom/nineoldandroids/a/c;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nineoldandroids/a/c$e;

    iput-object v0, p0, Lcom/nineoldandroids/a/c$b;->b:Lcom/nineoldandroids/a/c$e;

    .line 1029
    iget-object v0, p0, Lcom/nineoldandroids/a/c$b;->b:Lcom/nineoldandroids/a/c$e;

    if-nez v0, :cond_0

    .line 1030
    new-instance v0, Lcom/nineoldandroids/a/c$e;

    invoke-direct {v0, p2}, Lcom/nineoldandroids/a/c$e;-><init>(Lcom/nineoldandroids/a/a;)V

    iput-object v0, p0, Lcom/nineoldandroids/a/c$b;->b:Lcom/nineoldandroids/a/c$e;

    .line 1031
    invoke-static {p1}, Lcom/nineoldandroids/a/c;->b(Lcom/nineoldandroids/a/c;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/nineoldandroids/a/c$b;->b:Lcom/nineoldandroids/a/c$e;

    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1032
    invoke-static {p1}, Lcom/nineoldandroids/a/c;->d(Lcom/nineoldandroids/a/c;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/nineoldandroids/a/c$b;->b:Lcom/nineoldandroids/a/c$e;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1034
    :cond_0
    return-void
.end method


# virtual methods
.method public a(J)Lcom/nineoldandroids/a/c$b;
    .locals 1

    .prologue
    .line 1105
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Lcom/nineoldandroids/a/o;->b([F)Lcom/nineoldandroids/a/o;

    move-result-object v0

    .line 1106
    invoke-virtual {v0, p1, p2}, Lcom/nineoldandroids/a/o;->d(J)Lcom/nineoldandroids/a/o;

    .line 1107
    invoke-virtual {p0, v0}, Lcom/nineoldandroids/a/c$b;->b(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;

    .line 1108
    return-object p0

    .line 1105
    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public a(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;
    .locals 4

    .prologue
    .line 1044
    iget-object v0, p0, Lcom/nineoldandroids/a/c$b;->a:Lcom/nineoldandroids/a/c;

    invoke-static {v0}, Lcom/nineoldandroids/a/c;->b(Lcom/nineoldandroids/a/c;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nineoldandroids/a/c$e;

    .line 1045
    if-nez v0, :cond_0

    .line 1046
    new-instance v0, Lcom/nineoldandroids/a/c$e;

    invoke-direct {v0, p1}, Lcom/nineoldandroids/a/c$e;-><init>(Lcom/nineoldandroids/a/a;)V

    .line 1047
    iget-object v1, p0, Lcom/nineoldandroids/a/c$b;->a:Lcom/nineoldandroids/a/c;

    invoke-static {v1}, Lcom/nineoldandroids/a/c;->b(Lcom/nineoldandroids/a/c;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1048
    iget-object v1, p0, Lcom/nineoldandroids/a/c$b;->a:Lcom/nineoldandroids/a/c;

    invoke-static {v1}, Lcom/nineoldandroids/a/c;->d(Lcom/nineoldandroids/a/c;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1050
    :cond_0
    new-instance v1, Lcom/nineoldandroids/a/c$c;

    iget-object v2, p0, Lcom/nineoldandroids/a/c$b;->b:Lcom/nineoldandroids/a/c$e;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/nineoldandroids/a/c$c;-><init>(Lcom/nineoldandroids/a/c$e;I)V

    .line 1051
    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/c$e;->a(Lcom/nineoldandroids/a/c$c;)V

    .line 1052
    return-object p0
.end method

.method public b(Lcom/nineoldandroids/a/a;)Lcom/nineoldandroids/a/c$b;
    .locals 3

    .prologue
    .line 1084
    iget-object v0, p0, Lcom/nineoldandroids/a/c$b;->a:Lcom/nineoldandroids/a/c;

    invoke-static {v0}, Lcom/nineoldandroids/a/c;->b(Lcom/nineoldandroids/a/c;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nineoldandroids/a/c$e;

    .line 1085
    if-nez v0, :cond_0

    .line 1086
    new-instance v0, Lcom/nineoldandroids/a/c$e;

    invoke-direct {v0, p1}, Lcom/nineoldandroids/a/c$e;-><init>(Lcom/nineoldandroids/a/a;)V

    .line 1087
    iget-object v1, p0, Lcom/nineoldandroids/a/c$b;->a:Lcom/nineoldandroids/a/c;

    invoke-static {v1}, Lcom/nineoldandroids/a/c;->b(Lcom/nineoldandroids/a/c;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1088
    iget-object v1, p0, Lcom/nineoldandroids/a/c$b;->a:Lcom/nineoldandroids/a/c;

    invoke-static {v1}, Lcom/nineoldandroids/a/c;->d(Lcom/nineoldandroids/a/c;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1090
    :cond_0
    new-instance v1, Lcom/nineoldandroids/a/c$c;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lcom/nineoldandroids/a/c$c;-><init>(Lcom/nineoldandroids/a/c$e;I)V

    .line 1091
    iget-object v0, p0, Lcom/nineoldandroids/a/c$b;->b:Lcom/nineoldandroids/a/c$e;

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/c$e;->a(Lcom/nineoldandroids/a/c$c;)V

    .line 1092
    return-object p0
.end method
