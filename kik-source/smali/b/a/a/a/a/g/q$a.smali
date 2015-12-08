.class final Lb/a/a/a/a/g/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/a/a/a/a/g/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static final a:Lb/a/a/a/a/g/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 47
    new-instance v0, Lb/a/a/a/a/g/q;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb/a/a/a/a/g/q;-><init>(B)V

    sput-object v0, Lb/a/a/a/a/g/q$a;->a:Lb/a/a/a/a/g/q;

    return-void
.end method

.method static synthetic a()Lb/a/a/a/a/g/q;
    .locals 1

    .prologue
    .line 46
    sget-object v0, Lb/a/a/a/a/g/q$a;->a:Lb/a/a/a/a/g/q;

    return-object v0
.end method
