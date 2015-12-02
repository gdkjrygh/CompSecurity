.class public Lcom/facebook/orca/app/fm;
.super Ljava/lang/Object;
.source "OrcaLogBoundConnectionsInitializer.java"

# interfaces
.implements Lcom/facebook/base/c;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/facebook/orca/app/fm;

    sput-object v0, Lcom/facebook/orca/app/fm;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/app/fm;->b:Landroid/os/Handler;

    .line 26
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 33
    return-void
.end method
