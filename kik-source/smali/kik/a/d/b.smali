.class public final Lkik/a/d/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/a/d/b$b;,
        Lkik/a/d/b$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:I


# direct methods
.method public constructor <init>(ILjava/lang/String;I)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput p1, p0, Lkik/a/d/b;->a:I

    .line 16
    iput p3, p0, Lkik/a/d/b;->c:I

    .line 17
    iput-object p2, p0, Lkik/a/d/b;->b:Ljava/lang/String;

    .line 18
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lkik/a/d/b;->a:I

    return v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lkik/a/d/b;->c:I

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lkik/a/d/b;->b:Ljava/lang/String;

    return-object v0
.end method
