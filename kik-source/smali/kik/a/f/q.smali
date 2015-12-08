.class public final Lkik/a/f/q;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 11
    iput p1, p0, Lkik/a/f/q;->a:I

    .line 12
    iput-object p2, p0, Lkik/a/f/q;->b:Ljava/lang/Object;

    .line 13
    return-void
.end method

.method public static a(Ljava/lang/Throwable;)I
    .locals 1

    .prologue
    .line 27
    instance-of v0, p0, Lkik/a/f/q;

    if-eqz v0, :cond_0

    .line 28
    check-cast p0, Lkik/a/f/q;

    iget v0, p0, Lkik/a/f/q;->a:I

    .line 30
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public static b(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 35
    instance-of v0, p0, Lkik/a/f/q;

    if-eqz v0, :cond_0

    .line 36
    check-cast p0, Lkik/a/f/q;

    iget-object v0, p0, Lkik/a/f/q;->b:Ljava/lang/Object;

    .line 37
    if-eqz v0, :cond_0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 38
    check-cast v0, Ljava/lang/String;

    .line 41
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 17
    iget v0, p0, Lkik/a/f/q;->a:I

    return v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lkik/a/f/q;->b:Ljava/lang/Object;

    return-object v0
.end method
