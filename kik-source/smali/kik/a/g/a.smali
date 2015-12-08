.class public final Lkik/a/g/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lkik/a/g/a;->a:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Lkik/a/g/a;->b:Ljava/util/HashMap;

    .line 17
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lkik/a/g/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/a/g/a;->b:Ljava/util/HashMap;

    return-object v0
.end method
