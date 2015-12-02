.class public Lcom/facebook/orca/h/c;
.super Ljava/lang/Object;
.source "MemoryUsageDumper.java"


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/ui/images/cache/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    const-class v0, Lcom/facebook/orca/h/c;

    sput-object v0, Lcom/facebook/orca/h/c;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/ui/images/cache/a;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/facebook/orca/h/c;->b:Lcom/facebook/ui/images/cache/a;

    .line 24
    return-void
.end method
