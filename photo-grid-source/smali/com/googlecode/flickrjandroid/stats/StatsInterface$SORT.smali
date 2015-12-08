.class public final enum Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum COMMENTS:Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;

.field private static final synthetic ENUM$VALUES:[Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;

.field public static final enum FAVORITES:Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;

.field public static final enum VIEWS:Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 46
    new-instance v0, Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;

    const-string v1, "VIEWS"

    invoke-direct {v0, v1, v2}, Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;->VIEWS:Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;

    new-instance v0, Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;

    const-string v1, "COMMENTS"

    invoke-direct {v0, v1, v3}, Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;->COMMENTS:Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;

    new-instance v0, Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;

    const-string v1, "FAVORITES"

    invoke-direct {v0, v1, v4}, Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;->FAVORITES:Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;

    .line 45
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;

    sget-object v1, Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;->VIEWS:Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;

    aput-object v1, v0, v2

    sget-object v1, Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;->COMMENTS:Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;

    aput-object v1, v0, v3

    sget-object v1, Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;->FAVORITES:Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;

    aput-object v1, v0, v4

    sput-object v0, Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;->ENUM$VALUES:[Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;

    return-object v0
.end method

.method public static values()[Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;->ENUM$VALUES:[Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;

    array-length v1, v0

    new-array v2, v1, [Lcom/googlecode/flickrjandroid/stats/StatsInterface$SORT;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
