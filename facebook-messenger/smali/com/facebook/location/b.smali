.class public Lcom/facebook/location/b;
.super Ljava/lang/Object;
.source "CoordinatesBuilder.java"


# instance fields
.field private a:Ljava/lang/Double;

.field private b:Ljava/lang/Double;

.field private c:Ljava/lang/Double;

.field private d:Ljava/lang/Float;

.field private e:Ljava/lang/Float;

.field private f:Ljava/lang/Float;

.field private g:Ljava/lang/Float;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Double;)Lcom/facebook/location/b;
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/facebook/location/b;->a:Ljava/lang/Double;

    .line 25
    return-object p0
.end method

.method public a(Ljava/lang/Float;)Lcom/facebook/location/b;
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lcom/facebook/location/b;->d:Ljava/lang/Float;

    .line 52
    return-object p0
.end method

.method public a()Ljava/lang/Double;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/facebook/location/b;->a:Ljava/lang/Double;

    return-object v0
.end method

.method public b(Ljava/lang/Double;)Lcom/facebook/location/b;
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lcom/facebook/location/b;->b:Ljava/lang/Double;

    .line 34
    return-object p0
.end method

.method public b(Ljava/lang/Float;)Lcom/facebook/location/b;
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/facebook/location/b;->e:Ljava/lang/Float;

    .line 61
    return-object p0
.end method

.method public b()Ljava/lang/Double;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/location/b;->b:Ljava/lang/Double;

    return-object v0
.end method

.method public c(Ljava/lang/Double;)Lcom/facebook/location/b;
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/facebook/location/b;->c:Ljava/lang/Double;

    .line 43
    return-object p0
.end method

.method public c(Ljava/lang/Float;)Lcom/facebook/location/b;
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/facebook/location/b;->f:Ljava/lang/Float;

    .line 70
    return-object p0
.end method

.method public c()Ljava/lang/Double;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/location/b;->c:Ljava/lang/Double;

    return-object v0
.end method

.method public d(Ljava/lang/Float;)Lcom/facebook/location/b;
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lcom/facebook/location/b;->g:Ljava/lang/Float;

    .line 79
    return-object p0
.end method

.method public d()Ljava/lang/Float;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/location/b;->d:Ljava/lang/Float;

    return-object v0
.end method

.method public e()Ljava/lang/Float;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/facebook/location/b;->e:Ljava/lang/Float;

    return-object v0
.end method

.method public f()Ljava/lang/Float;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/location/b;->f:Ljava/lang/Float;

    return-object v0
.end method

.method public g()Ljava/lang/Float;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/location/b;->g:Ljava/lang/Float;

    return-object v0
.end method

.method public h()Lcom/facebook/location/Coordinates;
    .locals 1

    .prologue
    .line 83
    new-instance v0, Lcom/facebook/location/Coordinates;

    invoke-direct {v0, p0}, Lcom/facebook/location/Coordinates;-><init>(Lcom/facebook/location/b;)V

    return-object v0
.end method
