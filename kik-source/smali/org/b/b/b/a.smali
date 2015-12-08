.class abstract Lorg/b/b/b/a;
.super Lorg/b/b/b/d;
.source "SourceFile"

# interfaces
.implements Lorg/b/a/a/a;


# instance fields
.field a:[Ljava/lang/Class;

.field b:[Ljava/lang/String;

.field c:[Ljava/lang/Class;


# direct methods
.method constructor <init>(ILjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;[Ljava/lang/String;[Ljava/lang/Class;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1, p2, p3}, Lorg/b/b/b/d;-><init>(ILjava/lang/String;Ljava/lang/Class;)V

    .line 28
    iput-object p4, p0, Lorg/b/b/b/a;->a:[Ljava/lang/Class;

    .line 29
    iput-object p5, p0, Lorg/b/b/b/a;->b:[Ljava/lang/String;

    .line 30
    iput-object p6, p0, Lorg/b/b/b/a;->c:[Ljava/lang/Class;

    .line 31
    return-void
.end method
