.class final enum Lcom/google/inject/Key$NullAnnotationStrategy;
.super Ljava/lang/Enum;
.source "Key.java"

# interfaces
.implements Lcom/google/inject/Key$AnnotationStrategy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/Key;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "NullAnnotationStrategy"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/inject/Key$NullAnnotationStrategy;",
        ">;",
        "Lcom/google/inject/Key$AnnotationStrategy;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/inject/Key$NullAnnotationStrategy;

.field public static final enum INSTANCE:Lcom/google/inject/Key$NullAnnotationStrategy;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 372
    new-instance v0, Lcom/google/inject/Key$NullAnnotationStrategy;

    const-string v1, "INSTANCE"

    invoke-direct {v0, v1, v2}, Lcom/google/inject/Key$NullAnnotationStrategy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/inject/Key$NullAnnotationStrategy;->INSTANCE:Lcom/google/inject/Key$NullAnnotationStrategy;

    .line 371
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/inject/Key$NullAnnotationStrategy;

    sget-object v1, Lcom/google/inject/Key$NullAnnotationStrategy;->INSTANCE:Lcom/google/inject/Key$NullAnnotationStrategy;

    aput-object v1, v0, v2

    sput-object v0, Lcom/google/inject/Key$NullAnnotationStrategy;->$VALUES:[Lcom/google/inject/Key$NullAnnotationStrategy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 371
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/inject/Key$NullAnnotationStrategy;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 371
    const-class v0, Lcom/google/inject/Key$NullAnnotationStrategy;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/inject/Key$NullAnnotationStrategy;

    return-object v0
.end method

.method public static values()[Lcom/google/inject/Key$NullAnnotationStrategy;
    .locals 1

    .prologue
    .line 371
    sget-object v0, Lcom/google/inject/Key$NullAnnotationStrategy;->$VALUES:[Lcom/google/inject/Key$NullAnnotationStrategy;

    invoke-virtual {v0}, [Lcom/google/inject/Key$NullAnnotationStrategy;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/inject/Key$NullAnnotationStrategy;

    return-object v0
.end method


# virtual methods
.method public getAnnotation()Ljava/lang/annotation/Annotation;
    .locals 1

    .prologue
    .line 383
    const/4 v0, 0x0

    return-object v0
.end method

.method public getAnnotationType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .prologue
    .line 387
    const/4 v0, 0x0

    return-object v0
.end method

.method public hasAttributes()Z
    .locals 1

    .prologue
    .line 375
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 391
    const-string v0, "[none]"

    return-object v0
.end method

.method public withoutAttributes()Lcom/google/inject/Key$AnnotationStrategy;
    .locals 2

    .prologue
    .line 379
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Key already has no attributes."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
