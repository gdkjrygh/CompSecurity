.class public final enum Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "DragState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum Delete:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

.field public static final enum In:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

.field public static final enum Out:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

.field public static final enum Release:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

.field public static final enum StartDrag:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

.field public static final enum UnInstall:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

.field private static final synthetic a:[Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 14
    new-instance v0, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    const-string/jumbo v1, "StartDrag"

    invoke-direct {v0, v1, v3}, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->StartDrag:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    new-instance v0, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    const-string/jumbo v1, "In"

    invoke-direct {v0, v1, v4}, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->In:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    new-instance v0, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    const-string/jumbo v1, "Out"

    invoke-direct {v0, v1, v5}, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->Out:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    new-instance v0, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    const-string/jumbo v1, "Release"

    invoke-direct {v0, v1, v6}, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->Release:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    new-instance v0, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    const-string/jumbo v1, "Delete"

    invoke-direct {v0, v1, v7}, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->Delete:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    new-instance v0, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    const-string/jumbo v1, "UnInstall"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->UnInstall:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    .line 13
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    sget-object v1, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->StartDrag:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->In:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->Out:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    aput-object v1, v0, v5

    sget-object v1, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->Release:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    aput-object v1, v0, v6

    sget-object v1, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->Delete:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->UnInstall:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->a:[Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

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
    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;
    .locals 1

    .prologue
    .line 13
    const-class v0, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;
    .locals 1

    .prologue
    .line 13
    sget-object v0, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->a:[Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    invoke-virtual {v0}, [Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    return-object v0
.end method
