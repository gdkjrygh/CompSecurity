.class public Lkik/a/d/a/m;
.super Lkik/a/d/a/g;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 9
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lkik/a/d/a/g;-><init>(ZZ)V

    .line 10
    iput-object p1, p0, Lkik/a/d/a/m;->a:Ljava/lang/String;

    .line 11
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lkik/a/d/a/m;->a:Ljava/lang/String;

    return-object v0
.end method
