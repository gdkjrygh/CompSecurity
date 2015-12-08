.class public final enum Lkik/android/chat/fragment/ScanCodeTabFragment$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/ScanCodeTabFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field public static final enum a:Lkik/android/chat/fragment/ScanCodeTabFragment$c;

.field public static final enum b:Lkik/android/chat/fragment/ScanCodeTabFragment$c;

.field public static final enum c:Lkik/android/chat/fragment/ScanCodeTabFragment$c;

.field public static final enum d:Lkik/android/chat/fragment/ScanCodeTabFragment$c;

.field public static final enum e:Lkik/android/chat/fragment/ScanCodeTabFragment$c;

.field private static final synthetic g:[Lkik/android/chat/fragment/ScanCodeTabFragment$c;


# instance fields
.field private final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 56
    new-instance v0, Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    const-string v1, "PULL"

    const-string v2, "Pull"

    invoke-direct {v0, v1, v3, v2}, Lkik/android/chat/fragment/ScanCodeTabFragment$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkik/android/chat/fragment/ScanCodeTabFragment$c;->a:Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    .line 57
    new-instance v0, Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    const-string v1, "SETTINGS"

    const-string v2, "Settings"

    invoke-direct {v0, v1, v4, v2}, Lkik/android/chat/fragment/ScanCodeTabFragment$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkik/android/chat/fragment/ScanCodeTabFragment$c;->b:Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    .line 58
    new-instance v0, Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    const-string v1, "FIND_PEOPLE"

    const-string v2, "Find People"

    invoke-direct {v0, v1, v5, v2}, Lkik/android/chat/fragment/ScanCodeTabFragment$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkik/android/chat/fragment/ScanCodeTabFragment$c;->c:Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    .line 59
    new-instance v0, Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    const-string v1, "GROUP"

    const-string v2, "Group Info"

    invoke-direct {v0, v1, v6, v2}, Lkik/android/chat/fragment/ScanCodeTabFragment$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkik/android/chat/fragment/ScanCodeTabFragment$c;->d:Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    .line 60
    new-instance v0, Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    const-string v1, "DEEP_LINK"

    const-string v2, "Deep Link"

    invoke-direct {v0, v1, v7, v2}, Lkik/android/chat/fragment/ScanCodeTabFragment$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkik/android/chat/fragment/ScanCodeTabFragment$c;->e:Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    .line 55
    const/4 v0, 0x5

    new-array v0, v0, [Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    sget-object v1, Lkik/android/chat/fragment/ScanCodeTabFragment$c;->a:Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    aput-object v1, v0, v3

    sget-object v1, Lkik/android/chat/fragment/ScanCodeTabFragment$c;->b:Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    aput-object v1, v0, v4

    sget-object v1, Lkik/android/chat/fragment/ScanCodeTabFragment$c;->c:Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    aput-object v1, v0, v5

    sget-object v1, Lkik/android/chat/fragment/ScanCodeTabFragment$c;->d:Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    aput-object v1, v0, v6

    sget-object v1, Lkik/android/chat/fragment/ScanCodeTabFragment$c;->e:Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    aput-object v1, v0, v7

    sput-object v0, Lkik/android/chat/fragment/ScanCodeTabFragment$c;->g:[Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 65
    iput-object p3, p0, Lkik/android/chat/fragment/ScanCodeTabFragment$c;->f:Ljava/lang/String;

    .line 66
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkik/android/chat/fragment/ScanCodeTabFragment$c;
    .locals 1

    .prologue
    .line 55
    const-class v0, Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    return-object v0
.end method

.method public static values()[Lkik/android/chat/fragment/ScanCodeTabFragment$c;
    .locals 1

    .prologue
    .line 55
    sget-object v0, Lkik/android/chat/fragment/ScanCodeTabFragment$c;->g:[Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    invoke-virtual {v0}, [Lkik/android/chat/fragment/ScanCodeTabFragment$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lkik/android/chat/fragment/ScanCodeTabFragment$c;->f:Ljava/lang/String;

    return-object v0
.end method
