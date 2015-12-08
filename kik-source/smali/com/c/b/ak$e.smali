.class public final Lcom/c/b/ak$e;
.super Lcom/c/b/ak$h;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/au$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/ak;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private final a:I

.field private b:Lcom/c/b/i$g;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/c/b/ak$g;

.field private final e:Lcom/c/b/ak$d;

.field private f:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Lcom/c/b/ak$g;Lcom/c/b/ak$d;Ljava/lang/Integer;)V
    .locals 3

    .prologue
    .line 1663
    invoke-direct {p0}, Lcom/c/b/ak$h;-><init>()V

    .line 1664
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UNKNOWN_ENUM_VALUE_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/c/b/ak$d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1665
    invoke-static {}, Lcom/c/b/i$g;->n()Lcom/c/b/i$g$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/c/b/i$g$a;->a(Ljava/lang/String;)Lcom/c/b/i$g$a;

    move-result-object v0

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/c/b/i$g$a;->a(I)Lcom/c/b/i$g$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$g$a;->g()Lcom/c/b/i$g;

    move-result-object v0

    .line 1667
    const/4 v1, -0x1

    iput v1, p0, Lcom/c/b/ak$e;->a:I

    .line 1668
    iput-object v0, p0, Lcom/c/b/ak$e;->b:Lcom/c/b/i$g;

    .line 1669
    iput-object p1, p0, Lcom/c/b/ak$e;->d:Lcom/c/b/ak$g;

    .line 1670
    iput-object p2, p0, Lcom/c/b/ak$e;->e:Lcom/c/b/ak$d;

    .line 1671
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/c/b/ak$d;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x2e

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lcom/c/b/i$g;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$e;->c:Ljava/lang/String;

    .line 1672
    iput-object p3, p0, Lcom/c/b/ak$e;->f:Ljava/lang/Integer;

    .line 1675
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/ak$g;Lcom/c/b/ak$d;Ljava/lang/Integer;B)V
    .locals 0

    .prologue
    .line 1599
    invoke-direct {p0, p1, p2, p3}, Lcom/c/b/ak$e;-><init>(Lcom/c/b/ak$g;Lcom/c/b/ak$d;Ljava/lang/Integer;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/i$g;Lcom/c/b/ak$g;Lcom/c/b/ak$d;I)V
    .locals 2

    .prologue
    .line 1646
    invoke-direct {p0}, Lcom/c/b/ak$h;-><init>()V

    .line 1647
    iput p4, p0, Lcom/c/b/ak$e;->a:I

    .line 1648
    iput-object p1, p0, Lcom/c/b/ak$e;->b:Lcom/c/b/i$g;

    .line 1649
    iput-object p2, p0, Lcom/c/b/ak$e;->d:Lcom/c/b/ak$g;

    .line 1650
    iput-object p3, p0, Lcom/c/b/ak$e;->e:Lcom/c/b/ak$d;

    .line 1652
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3}, Lcom/c/b/ak$d;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/c/b/i$g;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$e;->c:Ljava/lang/String;

    .line 1654
    invoke-static {p2}, Lcom/c/b/ak$g;->a(Lcom/c/b/ak$g;)Lcom/c/b/ak$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/c/b/ak$b;->a(Lcom/c/b/ak$h;)V

    .line 1655
    invoke-static {p2}, Lcom/c/b/ak$g;->a(Lcom/c/b/ak$g;)Lcom/c/b/ak$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/c/b/ak$b;->a(Lcom/c/b/ak$e;)V

    .line 1656
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/i$g;Lcom/c/b/ak$g;Lcom/c/b/ak$d;IB)V
    .locals 0

    .prologue
    .line 1599
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/c/b/ak$e;-><init>(Lcom/c/b/i$g;Lcom/c/b/ak$g;Lcom/c/b/ak$d;I)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/ak$e;Lcom/c/b/i$g;)V
    .locals 0

    .prologue
    .line 1599
    iput-object p1, p0, Lcom/c/b/ak$e;->b:Lcom/c/b/i$g;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 1614
    iget-object v0, p0, Lcom/c/b/ak$e;->b:Lcom/c/b/i$g;

    invoke-virtual {v0}, Lcom/c/b/i$g;->k()I

    move-result v0

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1611
    iget-object v0, p0, Lcom/c/b/ak$e;->b:Lcom/c/b/i$g;

    invoke-virtual {v0}, Lcom/c/b/i$g;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1623
    iget-object v0, p0, Lcom/c/b/ak$e;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lcom/c/b/ak$g;
    .locals 1

    .prologue
    .line 1626
    iget-object v0, p0, Lcom/c/b/ak$e;->d:Lcom/c/b/ak$g;

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$d;
    .locals 1

    .prologue
    .line 1629
    iget-object v0, p0, Lcom/c/b/ak$e;->e:Lcom/c/b/ak$d;

    return-object v0
.end method

.method public final bridge synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 1599
    iget-object v0, p0, Lcom/c/b/ak$e;->b:Lcom/c/b/i$g;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1617
    iget-object v0, p0, Lcom/c/b/ak$e;->b:Lcom/c/b/i$g;

    invoke-virtual {v0}, Lcom/c/b/i$g;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
