.class public Lcom/facebook/orca/reflex/d;
.super Ljava/lang/Object;
.source "ReflexPrefKeys.java"

# interfaces
.implements Lcom/facebook/prefs/shared/ad;


# static fields
.field public static final a:Lcom/facebook/prefs/shared/ae;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 12
    sget-object v0, Lcom/facebook/reflex/ae;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "threadlist"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/reflex/d;->a:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            ">;"
        }
    .end annotation

    .prologue
    .line 17
    sget-object v0, Lcom/facebook/orca/reflex/d;->a:Lcom/facebook/prefs/shared/ae;

    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method
