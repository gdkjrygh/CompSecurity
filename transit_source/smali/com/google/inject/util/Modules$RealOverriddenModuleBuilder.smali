.class final Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder;
.super Ljava/lang/Object;
.source "Modules.java"

# interfaces
.implements Lcom/google/inject/util/Modules$OverriddenModuleBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/util/Modules;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "RealOverriddenModuleBuilder"
.end annotation


# instance fields
.field private final baseModules:Lcom/google/inject/internal/util/$ImmutableSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<",
            "Lcom/google/inject/Module;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<+",
            "Lcom/google/inject/Module;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 139
    .local p1, "baseModules":Ljava/lang/Iterable;, "Ljava/lang/Iterable<+Lcom/google/inject/Module;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    invoke-static {p1}, Lcom/google/inject/internal/util/$ImmutableSet;->copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder;->baseModules:Lcom/google/inject/internal/util/$ImmutableSet;

    .line 141
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Iterable;Lcom/google/inject/util/Modules$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Iterable;
    .param p2, "x1"    # Lcom/google/inject/util/Modules$1;

    .prologue
    .line 136
    invoke-direct {p0, p1}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder;-><init>(Ljava/lang/Iterable;)V

    return-void
.end method

.method static synthetic access$100(Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder;)Lcom/google/inject/internal/util/$ImmutableSet;
    .locals 1
    .param p0, "x0"    # Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder;

    .prologue
    .line 136
    iget-object v0, p0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder;->baseModules:Lcom/google/inject/internal/util/$ImmutableSet;

    return-object v0
.end method


# virtual methods
.method public with(Ljava/lang/Iterable;)Lcom/google/inject/Module;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<+",
            "Lcom/google/inject/Module;",
            ">;)",
            "Lcom/google/inject/Module;"
        }
    .end annotation

    .prologue
    .line 148
    .local p1, "overrides":Ljava/lang/Iterable;, "Ljava/lang/Iterable<+Lcom/google/inject/Module;>;"
    new-instance v0, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;

    invoke-direct {v0, p0, p1}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder$1;-><init>(Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder;Ljava/lang/Iterable;)V

    return-object v0
.end method

.method public varargs with([Lcom/google/inject/Module;)Lcom/google/inject/Module;
    .locals 1
    .param p1, "overrides"    # [Lcom/google/inject/Module;

    .prologue
    .line 144
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/inject/util/Modules$RealOverriddenModuleBuilder;->with(Ljava/lang/Iterable;)Lcom/google/inject/Module;

    move-result-object v0

    return-object v0
.end method
