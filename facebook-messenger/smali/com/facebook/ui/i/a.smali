.class public Lcom/facebook/ui/i/a;
.super Ljava/lang/Object;
.source "ToastBuilder.java"


# instance fields
.field private a:Ljava/lang/CharSequence;

.field private b:I

.field private c:I

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput p1, p0, Lcom/facebook/ui/i/a;->c:I

    .line 30
    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/ui/i/a;->a:Ljava/lang/CharSequence;

    .line 22
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/ui/i/a;->a:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 83
    iget v0, p0, Lcom/facebook/ui/i/a;->c:I

    return v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 90
    iget v0, p0, Lcom/facebook/ui/i/a;->b:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/facebook/ui/i/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/ui/i/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/facebook/ui/i/a;->f:Ljava/lang/String;

    return-object v0
.end method
